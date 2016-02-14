package behavioral.command;

/**
 * Created by jarydu on 2/14/16.
 */
public class Stock {

    private final String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Buy stock[" + name + "] for [" + quantity + "]unit");
    }

    public void sell() {
        System.out.println("Sell stock[" + name + "] for [" + quantity + "]unit");
    }
}
