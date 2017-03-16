package behavioral.command.grocery;

/**
 * Created by jarydu on 3/15/17.
 */
public class AddOrder implements PurchaseOrder {
    private final Food food;

    public AddOrder(Food food) {
        this.food = food;
    }

    @Override
    public void exercise() {
        System.out.println("Addding $" + food.getPrice());
    }
}
