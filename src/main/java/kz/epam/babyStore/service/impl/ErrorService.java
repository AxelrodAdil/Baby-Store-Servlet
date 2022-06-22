package kz.epam.babyStore.service.impl;

import kz.epam.babyStore.service.Service;
import kz.epam.babyStore.util.constants.Pages;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ErrorService implements Service {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(Pages.MAIN_JSP);
        dispatcher.forward(request, response);
    }
}
