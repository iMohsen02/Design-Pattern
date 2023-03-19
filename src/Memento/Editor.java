public class Editor {
    private String content;

    public Editor() {

    }

    public Editor(String content) {
        this.content = content;
    }

    public EditorState createState(String newContent) {
        EditorState editorState = new EditorState(content);
        this.content = newContent;
        return editorState;
    }

    public void restor(EditorState editorState) {
        this.content = editorState.getContent();
    }

    @Override
    public String toString() {
        return this.content;
    }
}
