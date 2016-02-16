package behavioral.template;

/**
 * Created by jarydu on 2/15/16.
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }
}
