package behavioral.vistor;

/**
 * Created by jarydu on 2/17/16.
 */
public interface ComputerPartVistor {
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
