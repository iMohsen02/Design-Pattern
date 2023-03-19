package state;

public class Canvas {
    private Tool currentTool;

    public void mouseDown() {
        // don't use enum and if else or switch case to handle this.
        // that's hard to change and add features are impossible
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
