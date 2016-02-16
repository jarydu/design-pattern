package structural.decorator;

/**
 * Created by jarydu on 2/4/16.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("adding the extra red color feature");
    }
}
