package behavioral.command;

/**
 * Created by jarydu on 2/14/16.
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.buy();
    }
}
