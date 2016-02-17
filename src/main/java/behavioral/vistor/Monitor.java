package behavioral.vistor;

/**
 * Created by jarydu on 2/17/16.
 */
public class Monitor implements ComputerPart {
    public void accept(ComputerPartVistor visitor) {
        visitor.visit(this);
    }
}
