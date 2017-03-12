package structural.adapter.socket;

/**
 * Created by jarydu on 3/12/17.
 */
public class IndiaSocket implements Socket {

    private final Volt volt;

    public IndiaSocket() {
        this.volt = new Volt(220);
    }

    public Volt getVolt() {
        return volt;
    }
}
