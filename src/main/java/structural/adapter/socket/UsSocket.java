package structural.adapter.socket;

/**
 * Created by jarydu on 3/12/17.
 */
public class UsSocket implements Socket {
    private final Volt volt;

    public UsSocket() {
        this.volt = new Volt(120);
    }

    public Volt getVolt() {
        return volt;
    }
}
