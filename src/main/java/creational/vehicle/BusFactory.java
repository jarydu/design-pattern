package creational.vehicle;

/**
 * Created by jarydu on 3/11/17.
 */
public class BusFactory extends VehicleFactory {

    public static final VehicleFactory instance = new BusFactory();

    public Vehicle makeCar() {
        return new Bus();
    }
}
