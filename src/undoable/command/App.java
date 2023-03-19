package undoable.command;

public class App {
    public static void main(String[] args) {

        History history = new History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Mohsen Gholami");

        BoldText boldText = new BoldText(document, history);
        UndoCommand undoableCommand = new UndoCommand(history);

        boldText.execute();
        System.out.println(document.getContent());

        undoableCommand.execute();
        System.out.println(document.getContent());
    }
}

