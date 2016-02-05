package facade;

/**
 * Created by jarydu on 2/4/16.
 */
public class FacadeDemo {

    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();

        maker.drawCircle();
        maker.drawRectangle();
    }
}
