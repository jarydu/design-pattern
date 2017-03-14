package structural.bridge.colorful;

/**
 * Created by jarydu on 3/13/17.
 */
public abstract class Weapon {
    private final Color color;

    public Weapon(Color color) {
        this.color = color;
    }

    abstract void fire();

    protected String getColor() {
        return color.showColor();
    }

    public static void main(String[] args) {
        Weapon rifle = new Rifle(new Red());
        Weapon mGun = new MachineGun(new Blue());

        rifle.fire();
        mGun.fire();
    }
}
