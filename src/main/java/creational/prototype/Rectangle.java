package creational.prototype;

/**
 * Created by jarydu on 2/16/16.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Draw an rectangle");
    }
}
