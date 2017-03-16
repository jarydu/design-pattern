package behavioral.state.machine;

/**
 * Created by jarydu on 3/15/17.
 */
public class StartState implements State {

    private StartState() {

    }

    public static State getInstance() {
        return new StartState();
    }

    @Override
    public void doAction() {
        System.out.println("Starting ...");
    }
}
