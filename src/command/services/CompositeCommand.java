package command.services;

import command.pattern.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        this.commandList.add(command);
    }
    @Override
    public void execute() {
        commandList.forEach(Command::execute);
    }
}
