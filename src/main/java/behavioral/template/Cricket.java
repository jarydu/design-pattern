package behavioral.template;

/**
 * Created by jarydu on 2/15/16.
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket game init");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket game play");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game end");
    }
}
