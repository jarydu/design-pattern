package behavioral.chain;

/**
 * Created by jarydu on 2/14/16.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console:Logger: " + message);
    }
}
