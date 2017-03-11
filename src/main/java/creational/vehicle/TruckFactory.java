package creational.vehicle;

/**
 * Created by jarydu on 3/11/17.
 */
public class TruckFactory extends VehicleFactory {

    public static final VehicleFactory instance = new TruckFactory();

    public Vehicle makeCar() {
        return new Truck();
    }
}
