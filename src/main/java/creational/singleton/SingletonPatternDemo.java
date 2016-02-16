package creational.singleton;

/**
 * Created by jarydu on 2/15/16.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
