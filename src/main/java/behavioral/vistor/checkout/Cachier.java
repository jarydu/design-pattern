package behavioral.vistor.checkout;

/**
 * Created by jarydu on 3/14/17.
 */
public class Cachier implements Vistor {
    private int sum = 0;

    @Override
    public void add(int price) {
        sum += price;
    }

    @Override
    public void remove(int price) {
        sum -= price;
    }

    @Override
    public int calculate() {
        return sum;
    }
}
