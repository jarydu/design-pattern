package behavioral.observer.news;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jarydu on 3/12/17.
 */
public class JarySub implements Subscriber {
    private static final Logger logger = LoggerFactory.getLogger(JarySub.class);

    @Override
    public void send(Message msg) {
        logger.info("Jary reports: " + msg.getMsg());
    }
}
