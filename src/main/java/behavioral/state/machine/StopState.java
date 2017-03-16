package behavioral.state.machine;

/**
 * Created by jarydu on 3/15/17.
 */
public class StopState implements State {

    private StopState() {

    }

    public static State getInstance() {
        return new StopState();
    }
    @Override
    public void doAction() {
        System.out.println("Stopping ...");
    }
}
