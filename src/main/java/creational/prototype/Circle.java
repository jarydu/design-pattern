package creational.prototype;

/**
 * Created by jarydu on 2/16/16.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}
