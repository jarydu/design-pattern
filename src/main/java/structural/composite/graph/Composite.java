package structural.composite.graph;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * Created by jarydu on 3/13/17.
 */
public class Composite implements Component {
    List<Component> comp = Lists.newArrayList();

    @Override
    public void operation() {
        System.out.println();
        System.out.println("Yo, I am the composite");
        for (Component c : comp) {
            c.operation();
        }
        System.out.println();
    }

    @Override
    public void add(Component component) {
        comp.add(component);
    }

    @Override
    public void remove(Component component) {
        comp.remove(component);
    }

    @Override
    public Collection<Component> getChildren() {
        return comp;
    }

    public static class Builder {
        final Component head;
        final List<Component> builderComp = Lists.newArrayList();

        public Builder(Component comp) {
            this.head = comp;
        }

        public Builder add(Component comp) {
            builderComp.add(comp);
            return this;
        }

        public Component build() {
            for (Component comp : builderComp) {
                head.add(comp);
            }

            return head;
        }
    }

    public static void main(String[] args) {
        Component head = new Composite.Builder(new Composite())
                                        .add(new Leaf())
                                        .add(new Leaf())
                                        .add(new Composite.Builder(new Composite())
                                                                        .add(new Leaf())
                                                                        .add(new Leaf())
                                                                        .build())
                                        .add(new Leaf())
                                        .build();
        for (Component c : head.getChildren()) {
            c.operation();
        }
    }
}
