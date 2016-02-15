package behavioral.mediator;

/**
 * Created by jarydu on 2/14/16.
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("john");

        robert.sendMessage("HI!John");
        john.sendMessage("HI!Robert");
    }
}
