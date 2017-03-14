package behavioral.template.machine;

/**
 * Created by jarydu on 3/14/17.
 */
public class WalkingMachine extends Machine {

    @Override
    protected void warmUp() {
        System.out.println("Warming up walking");
    }

    @Override
    protected void run() {
        System.out.println("Running walking");
    }

    @Override
    protected void stop() {
        System.out.println("Walking stop");
    }
}
