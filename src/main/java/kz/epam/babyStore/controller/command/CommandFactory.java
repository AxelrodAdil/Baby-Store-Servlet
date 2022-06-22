package kz.epam.babyStore.controller.command;

import kz.epam.babyStore.controller.command.impl.GoToMainCommand;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CommandFactory {

    private static final Map<String, Command> commands = new HashMap<>();

    private CommandFactory() {
        commands.put(CommandName.MAIN_COMMAND, new GoToMainCommand());
    }

    public Command getCommand(String name) {
        return Optional.ofNullable(commands.get(name)).orElse(commands.get(CommandName.DEFAULT_COMMAND));
    }

    public static CommandFactory getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        static final CommandFactory INSTANCE = new CommandFactory();
    }
}
