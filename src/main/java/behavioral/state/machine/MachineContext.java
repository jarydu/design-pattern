package behavioral.state.machine;

import javafx.scene.paint.Stop;

/**
 * Created by jarydu on 3/15/17.
 */
public class MachineContext implements State {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        if (state == null) {
            throw new RuntimeException("No state");
        }

        state.doAction();
    }

    public static void main(String[] args) {
        MachineContext context = new MachineContext();

        context.setState(StartState.getInstance());
        context.doAction();

        context.setState(RunState.getInstance());
        context.doAction();

        context.setState(StopState.getInstance());
        context.doAction();

    }
}
