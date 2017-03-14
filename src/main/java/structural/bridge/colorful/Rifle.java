package structural.bridge.colorful;

/**
 * Created by jarydu on 3/13/17.
 */
public class Rifle extends Weapon {

    public Rifle(Color color) {
        super(color);
    }

    @Override
    void fire() {
        System.out.println("[" + getColor() + "]Bew... bew... bew...");
    }
}
