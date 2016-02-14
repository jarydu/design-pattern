package behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jarydu on 2/14/16.
 */
public class StockBroker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList)
            order.execute();

        orderList.clear();
    }
}
