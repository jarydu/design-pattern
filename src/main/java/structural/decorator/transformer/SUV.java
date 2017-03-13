package structural.decorator.transformer;

/**
 * Created by jarydu on 3/13/17.
 */
public class SUV implements Vehicle {
    @Override
    public void run() {
        System.out.println("Running in the field");
    }

    @Override
    public void stop() {
        System.out.println("Stopping in the field");
    }
}
