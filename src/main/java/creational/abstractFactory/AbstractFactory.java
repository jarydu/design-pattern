package creational.abstractFactory;

/**
 * Created by jarydu on 2/15/16.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
