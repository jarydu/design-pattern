package behavioral.vistor.checkout;

/**
 * Created by jarydu on 3/14/17.
 */
public interface Vistor {

    void add(int price);

    void remove(int price);

    int calculate();
}
