package creational.vehicle;

/**
 * Created by jarydu on 3/11/17.
 */
public class Demo {

    public static void main(String[] args) {

        // Factory Method - My Understanding
        FullVehicleFactory factory = FullVehicleFactory.instance;
        Vehicle suvFull = factory.makeCar(FullVehicleFactory.Type.SUV);
        Vehicle sedanFull = factory.makeCar(FullVehicleFactory.Type.SEDAN);

        // Abstract Factory
        VehicleFactory busFactory = BusFactory.instance;
        Vehicle bus = busFactory.makeCar();

        VehicleFactory suvFactory = SUVFactory.instance;
        Vehicle suv = suvFactory.makeCar();

        VehicleFactory sedanFactory = SedanFactory.instance;
        Vehicle sedan = sedanFactory.makeCar();

        VehicleFactory truckFactory = TruckFactory.instance;
        Vehicle truck = truckFactory.makeCar();

        VehicleFactory superCarFactory = SuperCarFactory.instance;
        Vehicle superCar = superCarFactory.makeCar();
    }
}
