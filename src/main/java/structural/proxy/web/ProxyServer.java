package structural.proxy.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jarydu on 3/13/17.
 */
public class ProxyServer implements Server {
    private static final Logger logger = LoggerFactory.getLogger(ProxyServer.class);

    private Server server;
    private Page page;

    @Override
    public Page get() {
        if (page == null) {
            server = getServer();
            page = server.get();
        }

        return page;
    }

    Server getServer() {
        return new ContentServer();
    }

    public static void main(String[] args) {
        Server proxy = new ProxyServer();

        logger.info("Start fetching...");

        proxy.get();
        logger.info("Fetched 1...");

        proxy.get();
        logger.info("Fetched 2...");
    }
}
