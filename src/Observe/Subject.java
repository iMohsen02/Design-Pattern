package Observe;

import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject {
    private List<Observe> observes = new ArrayList<>();

    public void addObserve(Observe observe) {
        observes.add(observe);
    }

    public void notifyObserve() {
        observes.forEach(observe -> observe.update());
    }

    public void removeObserve(Observe observe) {
        observes.remove(observe);
    }

}
