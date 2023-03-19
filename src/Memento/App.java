public class App {
    public static void main(String[] args) {

        Editor editor = new Editor("a");
        History history = new History();

        history.push(editor.createState("b"));
        System.out.println(editor);

        history.push(editor.createState("c"));
        System.out.println(editor);

        editor.restor(history.pop());
        System.out.println(editor);

        history.push(editor.createState("d"));
        System.out.println(editor);
    }
}

