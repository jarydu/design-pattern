package behavioral.interpreter;

/**
 * Created by jarydu on 2/14/16.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {

        if (context.contains(data))
            return true;

        return false;
    }
}
