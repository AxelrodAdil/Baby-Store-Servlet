package kz.epam.babyStore.controller.command;

import kz.epam.babyStore.controller.context.RequestContextHelper;

import javax.servlet.http.HttpServletResponse;

public interface Command {

    CommandResult execute(RequestContextHelper helper, HttpServletResponse response);
}
