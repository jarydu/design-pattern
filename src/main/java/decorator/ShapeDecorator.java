package decorator;

/**
 * Created by jarydu on 2/4/16.
 */
public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
