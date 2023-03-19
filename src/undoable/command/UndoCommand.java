package undoable.command;

import undoable.command.commandapi.Command;

public class UndoCommand implements Command {
    History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.hasNext()) {
            history.pop().unExecute();
        }
    }
}
