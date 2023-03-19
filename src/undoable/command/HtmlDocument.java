package undoable.command;

public class HtmlDocument {
    private String content;

    public String getContent() {
        return content;
    }

    public void makeBold() {
        content = "<b>" + content + "<\\b>";
    }

    public void setContent(String content) {
        this.content = content;
    }
}
