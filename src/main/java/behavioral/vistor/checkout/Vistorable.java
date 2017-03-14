package behavioral.vistor.checkout;

/**
 * Created by jarydu on 3/14/17.
 */
interface Vistorable {

    void checkout(Vistor vistor);

    void add(Item item);

    void remove(Item item);

}
