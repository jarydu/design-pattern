package behavioral.command.grocery;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * Created by jarydu on 3/15/17.
 */
public class Checkout {
    private final List<PurchaseOrder> orders = Lists.newArrayList();

    public void addOrder(PurchaseOrder order) {
        orders.add(order);
    }

    public void checkout() {
        for (PurchaseOrder o : orders) {
            o.exercise();
        }
    }

    public static void main(String[] args) {

        Checkout co = new Checkout();

        co.addOrder(new AddOrder(new Pudding()));
        co.addOrder(new AddOrder(new Chocolate()));
        co.addOrder(new AddOrder(new SweetBread()));
        co.addOrder(new AddOrder(new Chocolate()));
        co.addOrder(new RemoveOrder(new Chocolate()));

        co.checkout();

    }

}
