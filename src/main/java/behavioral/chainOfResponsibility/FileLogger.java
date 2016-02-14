package behavioral.chainOfResponsibility;

/**
 * Created by jarydu on 2/14/16.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File:Logger: " + message);
    }
}
