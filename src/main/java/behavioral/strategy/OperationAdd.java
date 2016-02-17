package behavioral.strategy;

/**
 * Created by jarydu on 2/16/16.
 */
public class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
