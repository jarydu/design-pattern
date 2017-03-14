package structural.flyweight.factory;

import com.google.common.collect.Maps;
import structural.facade.vehicle.*;

import java.util.Map;

/**
 * Created by jarydu on 3/13/17.
 */
public class Factory {
    public enum Type {

        SUV, SEDAN, TRUCK, BUS
    }

    private final Map<Type, Vehicle> factory = Maps.newHashMap();

    public static final Factory instance = new Factory();

    Vehicle getVehicle(Type type) {
        if (!factory.containsKey(type)) {
            switch (type) {
                case SUV: factory.put(type, new SUV());
                            break;
                case SEDAN: factory.put(type, new Sedan());
                            break;
                case TRUCK: factory.put(type, new Truck());
                            break;
                case BUS: factory.put(type, new Bus());
                            break;
                default:  throw new UnsupportedOperationException();

            }
        }

        return factory.get(type);
    }

    public static void main(String[] args) {
        Vehicle car = Factory.instance.getVehicle(Type.SEDAN);
        Vehicle bus = Factory.instance.getVehicle(Type.BUS);
        Vehicle suv = Factory.instance.getVehicle(Type.SUV);
        Vehicle truck = Factory.instance.getVehicle(Type.TRUCK);

        Vehicle newCar = Factory.instance.getVehicle(Type.SEDAN);

    }
}
