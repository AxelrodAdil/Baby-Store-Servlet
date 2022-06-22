package kz.epam.babyStore;

import kz.epam.babyStore.controller.command.Command;
import kz.epam.babyStore.controller.command.CommandFactory;
import kz.epam.babyStore.controller.command.CommandResult;
import kz.epam.babyStore.controller.context.RequestContextHelper;
import kz.epam.babyStore.dao.connection.ConnectionPool;
import kz.epam.babyStore.exception.ConnectionException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass().getName());
    private static final String COMMAND = "command";
    private static final String PATH = "/baby-store?";
    private static final String MAIN_COMMAND = "command=main";

    @Override
    public void init() throws ServletException {
        super.init();
        try {
            ConnectionPool.getInstance().initialize();
        } catch (ConnectionException e) {
            logger.error("Servlet wasn't init!");
            throw new RuntimeException(e);
        }
    }

    @Override
    public void destroy() {
        try {
            ConnectionPool.getInstance().destroy();
            super.destroy();
        } catch (ConnectionException e) {
            logger.error("Servlet wasn't destroy!");
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String commandName = request.getParameter(COMMAND);
        if (commandName == null || "".equals(commandName)) {
            response.sendRedirect(PATH + MAIN_COMMAND);
        } else {
            Command command = CommandFactory.getInstance().getCommand(commandName);
            RequestContextHelper contextHelper = new RequestContextHelper(request);
            CommandResult result = command.execute(contextHelper, response);
            dispatch(result, request, response);
        }
    }

    private void dispatch(CommandResult result, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (result.isRedirect()) {
            response.sendRedirect(PATH + result.getPage());
        } else {
            request.getRequestDispatcher(result.getPage()).forward(request, response);
        }
    }
}
