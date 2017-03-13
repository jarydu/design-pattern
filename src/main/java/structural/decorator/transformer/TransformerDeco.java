package structural.decorator.transformer;

/**
 * Created by jarydu on 3/13/17.
 */
public abstract class TransformerDeco implements Vehicle {
    final Vehicle vehicle;

    public TransformerDeco(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void run() {
        transform();
        vehicle.run();
    }

    @Override
    public void stop() {
        transform();
        vehicle.stop();
    }

    private void transform() {
        System.out.println("TRANSFORMING...");
    }
}
