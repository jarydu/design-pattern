package decorator;

/**
 * Created by jarydu on 2/4/16.
 */
public class BlueCircleDecorator extends ShapeDecorator {

    public BlueCircleDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("adding extra blue color feature");
    }
}
