package behavioral.state;

/**
 * Created by jarydu on 2/16/16.
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop state";
    }
}
