package creational.vehicle;

/**
 * Created by jarydu on 3/11/17.
 */
public class FullVehicleFactory {
    public enum Type {
        BUS, SEDAN, SUV, TRUCK, SUPER_CAR
    }

    public static final FullVehicleFactory instance = new FullVehicleFactory();

    public Vehicle makeCar(Type type) {
        switch (type) {
            case BUS: return new Bus();
            case SEDAN: return new Sedan();
            case SUV: return new SUV();
            case TRUCK: return new Truck();
            case SUPER_CAR: return new SuperCar();
            default: return new Sedan();
        }
    }
}
