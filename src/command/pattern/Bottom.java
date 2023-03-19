package command.pattern;

public class Bottom {

    Command command;
    private String label;

    public Bottom(Command command) {
        this.command = command;
    }

    public void click() {
        // what to do here for each different program?
        // use command design pattern

        System.out.println("bottom clicked.");
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
