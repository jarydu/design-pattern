package behavioral.observer;

/**
 * Created by jarydu on 2/15/16.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
       System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}
