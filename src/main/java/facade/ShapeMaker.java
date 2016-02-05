package facade;

/**
 * Created by jarydu on 2/4/16.
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
