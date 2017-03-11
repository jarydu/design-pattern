package creational.vehicle;

/**
 * Created by jarydu on 3/11/17.
 */
public class SUVFactory extends VehicleFactory {

    public static final VehicleFactory instance = new SUVFactory();

    public Vehicle makeCar() {
        return new SUV();
    }
}
