package creational.prototype.vehicle;

import java.util.Set;

import com.google.common.collect.Sets;
import structural.decorator.transformer.Camero;
import structural.decorator.transformer.SUV;
import structural.decorator.transformer.Truck;
import structural.decorator.transformer.Vehicle;

/**
 * Created by jarydu on 3/13/17.
 */
public class VehicleSquad implements Cloneable {
    private final Set<Vehicle> squad = Sets.newHashSet();

    private VehicleSquad() {

    }

    private VehicleSquad(Set<Vehicle> squad) {
        this.squad.addAll(squad);
    }

    public static VehicleSquad getInstance() {
        VehicleSquad vs = new VehicleSquad();
        vs.loadSquad();

        return vs;
    }

    private void loadSquad() {
        squad.add(new Truck("OG"));
        squad.add(new SUV("OG"));
        squad.add(new Camero("OG"));
    }

    public Set<Vehicle> getSquad() {
        return squad;
    }

    @Override
    public String toString() {
        return "VehicleSquad{" +
                "squad=" + squad +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Set<Vehicle> newSquad = Sets.newHashSet();
        for (Vehicle v : squad) {
            if (v instanceof Truck) {
                newSquad.add(new Truck("OG"));
            } else if (v instanceof SUV) {
                newSquad.add(new SUV("OG"));
            } else if (v instanceof Camero) {
                newSquad.add(new Camero("OG"));
            } else {
                throw new UnsupportedOperationException("Illegal type[" + v.getClass() + "]");
            }
        }

        VehicleSquad vs = new VehicleSquad(newSquad);
        vs.loadSquad();

        return vs;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        VehicleSquad proto = VehicleSquad.getInstance();

        for (Vehicle v : proto.squad) {
            System.out.println(v);
        }

        System.out.println();

        VehicleSquad s1 = (VehicleSquad) proto.clone();
        VehicleSquad s2 = (VehicleSquad) proto.clone();
        VehicleSquad s3 = (VehicleSquad) proto.clone();
        VehicleSquad s4 = (VehicleSquad) proto.clone();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        System.out.println();

        for (Vehicle v : proto.squad) {
            v.destroy();
        }

        for (Vehicle v : proto.squad) {
            System.out.println(v);
        }


        System.out.println();

        Set<Vehicle> vs = s1.getSquad();
        vs.add(new SUV("OG"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }


}
