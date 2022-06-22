package kz.epam.babyStore.controller.command.impl;

import kz.epam.babyStore.controller.command.Command;
import kz.epam.babyStore.controller.command.CommandResult;
import kz.epam.babyStore.controller.command.CommandResultType;
import kz.epam.babyStore.controller.context.RequestContext;
import kz.epam.babyStore.controller.context.RequestContextHelper;
import kz.epam.babyStore.entity.Category;
import kz.epam.babyStore.exception.ServiceException;
import kz.epam.babyStore.service.CategoryService;
import kz.epam.babyStore.service.ServiceFactory;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class GoToMainCommand implements Command {

    private static final String PAGE = "WEB-INF/view/main.jsp";
    private static final String ERROR_PAGE = "WEB-INF/view/error.jsp";
    private static final String CATEGORIES = "categories";

    @Override
    public CommandResult execute(RequestContextHelper helper, HttpServletResponse response) {
        RequestContext requestContext = helper.createContext();
        try {
            CategoryService categoryService = ServiceFactory.getInstance().getCategoryService();
            List<Category> categories = categoryService.retrieveCategories();
            requestContext.addRequestAttribute(CATEGORIES, categories);
        } catch (ServiceException e) {
            return new CommandResult(ERROR_PAGE, CommandResultType.FORWARD);
        }
        helper.updateRequest(requestContext);
        return new CommandResult(PAGE, CommandResultType.FORWARD);
    }
}
