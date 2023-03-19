package state.abusing;

public class RunningWatch implements State{

    private Stopwatch stopwatch;

    public RunningWatch(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }
    @Override
    public void click() {
        this.stopwatch.setCurrentState(new StopRunning(stopwatch));
        System.out.println("stopped");
    }
}
