package behavioral.mediator;

import java.util.Date;

/**
 * Created by jarydu on 2/14/16.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "]" + message);
    }
}
