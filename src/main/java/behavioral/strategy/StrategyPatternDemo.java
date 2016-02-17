package behavioral.strategy;

/**
 * Created by jarydu on 2/16/16.
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println(context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(10, 5));
    }
}
