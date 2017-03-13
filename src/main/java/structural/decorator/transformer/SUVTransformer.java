package structural.decorator.transformer;

/**
 * Created by jarydu on 3/13/17.
 */
public class SUVTransformer extends TransformerDeco {

    public SUVTransformer(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void run() {
        System.out.println("SUV is preping...");
        super.run();
    }

    @Override
    public void stop() {
        System.out.println("SUV is cooling...");
        super.run();
    }

    public static void main(String[] args) {
        Vehicle suvT = new SUVTransformer(new SUV());

        suvT.run();
        suvT.stop();

    }
}
