package creational.abstractFactory;

/**
 * Created by jarydu on 2/15/16.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null)
            return null;

        if (shape.equalsIgnoreCase("CIRCLE"))
            return new Circle();

        if (shape.equalsIgnoreCase("RECTANGLE"))
            return new Square();

        return null;
    }
}
