package behavioral.chain;

/**
 * Created by jarydu on 2/14/16.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console:Logger: " + message);
    }
}
