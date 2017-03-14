package behavioral.template.machine;

/**
 * Created by jarydu on 3/14/17.
 */
public class RunningMachine extends Machine {
    @Override
    protected void warmUp() {
        System.out.println("Warming up running");
    }

    @Override
    protected void run() {
        System.out.println("running");
    }

    @Override
    protected void stop() {
        System.out.println("stopping");
    }
}
