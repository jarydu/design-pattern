package structural.facade.vehicle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jarydu on 3/13/17.
 */
public class SUV implements Vehicle {
    private static final Logger logger = LoggerFactory.getLogger(SUV.class);

    private final Engine engine;
    private final Transmission trans;
    private final Tire tire;

    public SUV() {
        this(new Engine() {
            @Override
            public void bootup() {
                logger.info("Engine booting up");
            }

            @Override
            public void remain() {
                logger.info("Engine remaining status");
            }

            @Override
            public void accelerate() {
                logger.info("Engine accelerating");
            }

            @Override
            public void decelerate() {
                logger.info("Engine decelerating");
            }

            @Override
            public void stop() {

            }
        }, new Transmission() {
            @Override
            public void warmUp() {
                logger.info("Transmission warming up");
            }

            @Override
            public void run() {
                logger.info("Transmission running");
            }

            @Override
            public void stop() {
                logger.info("Transmission stopping");
            }
        }, new Tire() {
            @Override
            public void run() {
                logger.info("Tire rolling");
            }

            @Override
            public void stop() {
                logger.info("Tire stopping");
            }
        });
    }

    protected SUV(Engine engine, Transmission trans, Tire tire) {
        this.engine = engine;
        this.trans = trans;
        this.tire = tire;
    }

    @Override
    public void start() {
        engine.bootup();
        trans.warmUp();
        tire.stop();
    }

    @Override
    public void run() {
        engine.accelerate();
        trans.run();
        tire.run();
    }

    @Override
    public void accelerate() {
        engine.accelerate();
        trans.run();
        tire.run();
    }

    @Override
    public void stop() {
        engine.decelerate();
        trans.stop();
        tire.stop();
    }

    public static void main(String[] args) {
        SUV suv = new SUV();

        suv.start();
        suv.run();
        suv.stop();
    }
}
