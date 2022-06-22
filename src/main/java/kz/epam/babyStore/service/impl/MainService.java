package kz.epam.babyStore.service.impl;

import kz.epam.babyStore.dao.repository.CategoryDAOInterface;
import kz.epam.babyStore.dao.repository.impl.CategoryDaoImpl;
import kz.epam.babyStore.entity.Category;
import kz.epam.babyStore.exception.ServiceException;
import kz.epam.babyStore.service.Service;
import kz.epam.babyStore.util.constants.Pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MainService implements Service {

    private static final Logger logger = LogManager.getLogger();
    private static final String CATEGORIES = "categories";

    private final CategoryDAOInterface<Category> categoryDAOInterface = new CategoryDaoImpl();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            System.out.println("\n\n RIGHT 1?!");
            RequestDispatcher dispatcher;
            List<Category> categories = categoryDAOInterface.findAll();
            request.setAttribute(CATEGORIES, categories);
            dispatcher = request.getRequestDispatcher(Pages.MAIN_JSP);
            dispatcher.forward(request, response);
        } catch (Exception e) {
            logger.error("Exception on MainService");
            throw new ServiceException(e.getMessage(), e);
        }
    }
}
