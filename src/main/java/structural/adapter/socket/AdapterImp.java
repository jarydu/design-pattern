package structural.adapter.socket;

/**
 * Created by jarydu on 3/12/17.
 */
public class AdapterImp implements Adapter {

    private final Socket usSocket;
    private final Socket indiaSocket;
    private final Socket chinaScoket;

    public AdapterImp() {
        this.usSocket = new UsSocket();
        this.indiaSocket = new IndiaSocket();
        this.chinaScoket = new ChinaSocket();
    }


    public Volt getUs() {
        return usSocket.getVolt();
    }

    public Volt getIndia() {
        return indiaSocket.getVolt();
    }

    public Volt getChina() {
        return chinaScoket.getVolt();
    }
}
