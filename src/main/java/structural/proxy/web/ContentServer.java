package structural.proxy.web;

import com.google.common.util.concurrent.Uninterruptibles;

import java.util.concurrent.TimeUnit;

/**
 * Created by jarydu on 3/13/17.
 */
public class ContentServer implements Server {

    @Override
    public Page get() {
        Uninterruptibles.sleepUninterruptibly(5000, TimeUnit.MILLISECONDS);

        return new Page();
    }
}
