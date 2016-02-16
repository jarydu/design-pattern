package behavioral.template;

/**
 * Created by jarydu on 2/15/16.
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football game init");
    }

    @Override
    void startPlay() {
        System.out.println("Football game start");
    }

    @Override
    void endPlay() {
        System.out.println("Football game end");
    }
}
