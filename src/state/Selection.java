package state;

public class Selection implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Draw rectangle");
    }

    @Override
    public void mouseUp() {
        System.out.println("Selection ends.");
    }
}
