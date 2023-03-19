package undoable.command;

import undoable.command.commandapi.UndoableCommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commandDeque = new ArrayDeque<>();

    public void add(UndoableCommand undoableCommand) {
        this.commandDeque.add(undoableCommand);
    }

    public UndoableCommand pop() {
        return this.commandDeque.pop();
    }

    public boolean hasNext() {
        return this.commandDeque.size() > 0;
    }
}
