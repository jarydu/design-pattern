package creational.prototype;

/**
 * Created by jarydu on 2/16/16.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Drawing square");
    }
}
