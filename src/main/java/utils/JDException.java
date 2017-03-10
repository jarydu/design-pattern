package utils;

/**
 * Created by jarydu on 3/10/17.
 */
public class JDException extends Exception {

    private final String exception;

    public JDException(String exp) {
        this.exception = exp;
    }
}
