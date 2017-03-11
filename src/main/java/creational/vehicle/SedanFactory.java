package creational.vehicle;

/**
 * Created by jarydu on 3/11/17.
 */
public class SedanFactory extends VehicleFactory {

    public static final VehicleFactory instance = new SedanFactory();

    public Vehicle makeCar() {
        return new Sedan();
    }
}
