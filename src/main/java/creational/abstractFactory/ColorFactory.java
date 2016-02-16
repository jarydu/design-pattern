package creational.abstractFactory;

/**
 * Created by jarydu on 2/15/16.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color.equalsIgnoreCase("GREEN"))
            return new Green();

        if (color.equalsIgnoreCase("RED"))
            return new Red();

        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
