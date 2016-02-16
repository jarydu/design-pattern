package structural.composite;

/**
 * Created by jarydu on 2/4/16.
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("Jary Du", "HEAD", 10000000);
        Employee headDesign = new Employee("KG Man", "Design", 1000000);
        Employee headMarketing = new Employee("Yo Yo", "Marketing", 10000000);
        Employee worker = new Employee("Dead", "Labor", 1000000);

        CEO.add(headDesign);
        CEO.add(headMarketing);
        headDesign.add(worker);
        headMarketing.add(worker);

        
    }
}
