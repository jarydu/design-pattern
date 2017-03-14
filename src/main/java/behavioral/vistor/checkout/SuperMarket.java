package behavioral.vistor.checkout;

/**
 * Created by jarydu on 3/14/17.
 */
public class SuperMarket {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add(new Bread());
        cart.add(new Bread());

        cart.add(new Coco());
        cart.add(new Coco());
        cart.add(new Coco());

        cart.add(new Pepsi());
        cart.add(new Pepsi());

        Cachier cachier = new Cachier();
        cart.checkout(cachier);

        System.out.println(cachier.calculate());

    }
}
