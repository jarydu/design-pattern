package behavioral.observer.news;

/**
 * Created by jarydu on 3/12/17.
 */
public interface Subscriber {
    void send(Message msg);
}
