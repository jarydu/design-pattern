package creational.vehicle;

/**
 * Created by jarydu on 3/11/17.
 */
public class SuperCarFactory extends VehicleFactory {

    public static final VehicleFactory instance = new SuperCarFactory();

    public Vehicle makeCar() {
        return new SuperCar();
    }
}
