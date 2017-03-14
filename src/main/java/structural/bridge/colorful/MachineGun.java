package structural.bridge.colorful;

/**
 * Created by jarydu on 3/13/17.
 */
public class MachineGun extends Weapon {

    public MachineGun(Color color) {
        super(color);
    }

    @Override
    void fire() {
        System.out.println("[" + getColor() + "]Da da da....");
    }
}
