import java.util.Stack;

public class History {
    private Stack<EditorState> states = new Stack<>();

    public EditorState pop() {
        return states.pop();
    }

    public void push(EditorState editorState) {
        this.states.push(editorState);
    }
}
