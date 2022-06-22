package kz.epam.babyStore;

import kz.epam.babyStore.dao.connection.ConnectionPool;
import kz.epam.babyStore.exception.ConnectionException;
import kz.epam.babyStore.service.Service;
import kz.epam.babyStore.service.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class Controller extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass().getName());

    private final ServiceFactory serviceFactory = ServiceFactory.getInstance();

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
        String requestString = request.getServletPath();
        Service service = serviceFactory.getService(requestString);
        try {
            service.execute(request, response);
        } catch (ParseException | SQLException e) {
            logger.error(e);
        }
    }
}
