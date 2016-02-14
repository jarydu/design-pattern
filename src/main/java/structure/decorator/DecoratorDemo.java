package structure.decorator;

/**
 * Created by jarydu on 2/4/16.
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();

        Shape blueCircle = new BlueCircleDecorator(new Circle());
        blueCircle.draw();
    }
}
