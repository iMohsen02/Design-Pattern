package state;

public class Brush implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }

    @Override
    public void mouseUp() {
        System.out.println("End of line.");
    }
}
