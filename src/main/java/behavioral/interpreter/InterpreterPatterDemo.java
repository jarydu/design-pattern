package behavioral.interpreter;

/**
 * Created by jarydu on 2/14/16.
 */
public class InterpreterPatterDemo {

    public static Expression getMaleExpression() {
        return new OrExpression(new TerminalExpression("Robert"), new TerminalExpression("John"));
    }

    public static Expression getMarriedWomanExpression() {
        return new AndExpression(new TerminalExpression("Julie"), new TerminalExpression("Married"));
    }

    public static void main(String[] args) {
        System.out.println("John is male?: " + getMaleExpression().interpret("John"));
        System.out.println("Julie is a married woman?: " + getMarriedWomanExpression().interpret("Married Julie"));
    }
}
