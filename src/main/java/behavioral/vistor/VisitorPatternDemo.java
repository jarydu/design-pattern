package behavioral.vistor;

/**
 * Created by jarydu on 2/17/16.
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());

        Keyboard keyboard = new Keyboard();
        keyboard.accept(new ComputerPartDisplayVisitor());

        Monitor monitor = new Monitor();
        monitor.accept(new ComputerPartDisplayVisitor());

    }
}
