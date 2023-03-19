package state.abusing;

public class Stopwatch {
//    private boolean isRunning = false;
//
//    public void click() {
//        if (isRunning) {
//            isRunning = false;
//            System.out.println("stopped");
//        } else {
//            isRunning = true;
//            System.out.println("running");
//        }
//    }

    private State currentState = new StopRunning(this);

    public void click() {
        currentState.click();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
