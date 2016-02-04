package bridge;

/**
 * Created by jarydu on 2/4/16.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redC = new Circle(100, 100, 10, new RedCircle());
        Shape greenC = new Circle(100, 100, 10, new GreenCircle());

        redC.draw();
        greenC.draw();
    }

}
