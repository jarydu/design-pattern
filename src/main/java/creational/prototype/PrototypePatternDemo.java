package creational.prototype;

/**
 * Created by jarydu on 2/16/16.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape1 = ShapeCache.getShape("1");
        Shape cloneShape2 = ShapeCache.getShape("2");
        Shape cloneShape3 = ShapeCache.getShape("3");


        System.out.println("1: " + cloneShape1.getType());
        System.out.println("2: " + cloneShape2.getType());
        System.out.println("3: " + cloneShape3.getType());
    }
}
