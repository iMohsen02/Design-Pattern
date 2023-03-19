package undoable.command.commandapi;

public interface UndoableCommand extends Command {

    void unExecute();

}
