package behavioral.command;

import com.sun.corba.se.pept.broker.Broker;

/**
 * Created by jarydu on 2/14/16.
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock("abc", 10);

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        StockBroker broker = new StockBroker();

        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
