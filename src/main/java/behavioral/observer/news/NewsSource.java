package behavioral.observer.news;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jarydu on 3/12/17.
 */
public class NewsSource {
    private static final Logger logger = LoggerFactory.getLogger(NewsSource.class);

    private final Set<Subscriber> subs = new HashSet<>();

    public void register(Subscriber sub) {
        subs.add(sub);
    }

    public void remove(Subscriber sub) {
        subs.remove(sub);
    }

    public void sendMsg(Message msg) {
        subs.stream().parallel().forEach(s -> s.send(msg));
    }

    public static void main(String[] args) {
        NewsSource source = new NewsSource();

        source.register(new JarySub());
        source.register(new AndySub());
        source.register(new JohnnySub());
        source.register(new JeffSub());

        Message msg = new Message("Here is a huge message");
        source.sendMsg(msg);
    }
}
