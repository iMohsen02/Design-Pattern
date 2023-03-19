package state;

public class Eraser implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Erase screen");
    }

    @Override
    public void mouseUp() {
        System.out.println("End of erase.");
    }
}
