package creational.singleton;

/**
 * Created by jarydu on 2/15/16.
 */
public class SingleObject {

    // create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
