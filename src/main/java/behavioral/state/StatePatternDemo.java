package behavioral.state;

/**
 * Created by jarydu on 2/16/16.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println("Current state of context is " + context.getState());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println("Current state of context is " + context.getState());
    }
}
