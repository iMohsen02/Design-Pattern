package state.abusing;

public class StopRunning implements State{
    Stopwatch stopwatch;

    public StopRunning(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        // check if the current state is not running
        stopwatch.setCurrentState(new RunningWatch(stopwatch));
        System.out.println("Running");
    }
}
