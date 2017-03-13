package structural.composite.graph;

/**
 * Created by jarydu on 3/13/17.
 */
public class Leaf implements Component {

    @Override
    public void operation() {
        System.out.println("Yo, I am leaf");
    }
}
