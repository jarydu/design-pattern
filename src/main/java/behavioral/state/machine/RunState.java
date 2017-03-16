package behavioral.state.machine;

/**
 * Created by jarydu on 3/15/17.
 */
public class RunState implements State {

    private RunState() {

    }

    public static State getInstance() {
        return new RunState();
    }

    @Override
    public void doAction() {
        System.out.println("Running ...");
    }
}
