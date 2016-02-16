package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jarydu on 2/15/16.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer ob : observers)
            ob.update();
    }
}
