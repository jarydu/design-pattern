package structural.composite.graph;

import java.util.Collection;

/**
 * Created by jarydu on 3/13/17.
 */
public interface Component {

    void operation();
    default void add(Component component) {
        throw new UnsupportedOperationException("add action is not supported");
    }

    default void remove(Component component) {
        throw new UnsupportedOperationException("remove action is not supported");
    }

    default Collection<Component> getChildren() {
        throw new UnsupportedOperationException("get children action is not supported");
    }
}
