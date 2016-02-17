package behavioral.vistor;

/**
 * Created by jarydu on 2/17/16.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVistor {
    public void visit(Mouse mouse) {
        System.out.println("Displaying mouse");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor");
    }
}
