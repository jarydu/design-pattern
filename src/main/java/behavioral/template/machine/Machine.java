package behavioral.template.machine;

/**
 * Created by jarydu on 3/14/17.
 */
public abstract class Machine {

    protected abstract void warmUp();
    protected abstract void run();
    protected abstract void stop();

    public void execute() {
        warmUp();

        run();

        stop();
    }

    public static void main(String[] args) {

        Machine runner = new RunningMachine();
        Machine walker = new WalkingMachine();

        runner.execute();
        walker.execute();
    }
}
