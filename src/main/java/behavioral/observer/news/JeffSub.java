package behavioral.observer.news;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jarydu on 3/12/17.
 */
public class JeffSub implements Subscriber {
    private static final Logger logger = LoggerFactory.getLogger(JeffSub.class);

    @Override
    public void send(Message msg) {
        logger.info("Jeff reports: " + msg.getMsg());
    }
}
