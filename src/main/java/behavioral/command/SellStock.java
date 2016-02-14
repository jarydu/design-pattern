package behavioral.command;

/**
 * Created by jarydu on 2/14/16.
 */
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.sell();
    }
}
