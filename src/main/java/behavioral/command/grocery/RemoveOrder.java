package behavioral.command.grocery;

/**
 * Created by jarydu on 3/15/17.
 */
public class RemoveOrder implements PurchaseOrder {
    private final Food food;

    public RemoveOrder(Food food) {
        this.food = food;
    }


    @Override
    public void exercise() {
        System.out.println("Removing $" + food.getPrice());
    }
}
