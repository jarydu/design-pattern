package structural.bridge;

/**
 * Created by jarydu on 2/3/16.
 */
public class GreenCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw a green circle with radius[" + radius + "] at [" + x + ":" + y + "]");
    }
}
