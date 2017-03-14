package structural.decorator.transformer;

/**
 * Created by jarydu on 3/13/17.
 */
public class SUV implements Vehicle {

    private String name;

    public SUV(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Running in the field");
    }

    @Override
    public void stop() {
        System.out.println("Stopping in the field");
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
        return "SUV{" +
                "name='" + name + '\'' +
                '}';
    }
}
