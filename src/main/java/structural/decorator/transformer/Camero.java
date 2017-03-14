package structural.decorator.transformer;

/**
 * Created by jarydu on 3/13/17.
 */
public class Camero implements Vehicle {
    private String name;

    public Camero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {
        this.name = null;
    }

    @Override
    public String toString() {
        return "Camero{" +
                "name='" + name + '\'' +
                '}';
    }
}
