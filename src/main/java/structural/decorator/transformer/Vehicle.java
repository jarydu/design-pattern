package structural.decorator.transformer;

/**
 * Created by jarydu on 3/13/17.
 */
public interface Vehicle {

    void run();

    void stop();

    default void destroy() {
        throw new UnsupportedOperationException();
    }
}
