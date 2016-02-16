package behavioral.observer;

/**
 * Created by jarydu on 2/15/16.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
