package structural.decorator.transformer;

/**
 * Created by jarydu on 3/13/17.
 */
public class Truck implements Vehicle {

    private String name;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void destroy() {
        this.name = null;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                '}';
    }
}
