package undoable.command;

import undoable.command.commandapi.UndoableCommand;

public class BoldText implements UndoableCommand {
    HtmlDocument document;
    History history;
    String prevContent;

    public BoldText(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }


    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.add(this);
    }

    @Override
    public void unExecute() {
        document.setContent(prevContent);
    }
}
