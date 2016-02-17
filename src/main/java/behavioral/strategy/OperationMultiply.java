package behavioral.strategy;

/**
 * Created by jarydu on 2/16/16.
 */
public class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
