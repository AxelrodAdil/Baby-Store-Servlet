package kz.epam.babyStore.controller.command.impl;

import kz.epam.babyStore.controller.command.Command;
import kz.epam.babyStore.controller.command.CommandResult;
import kz.epam.babyStore.controller.command.CommandResultType;
import kz.epam.babyStore.controller.context.RequestContext;
import kz.epam.babyStore.controller.context.RequestContextHelper;

import javax.servlet.http.HttpServletResponse;

public class DefaultCommand implements Command {
    private static final String PAGE = "WEB-INF/view/error.jsp";

    @Override
    public CommandResult execute(RequestContextHelper helper, HttpServletResponse response) {
        RequestContext requestContext = helper.createContext();
        helper.updateRequest(requestContext);
        return new CommandResult(PAGE, CommandResultType.FORWARD);
    }
}
