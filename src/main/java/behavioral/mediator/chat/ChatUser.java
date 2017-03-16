package behavioral.mediator.chat;

/**
 * Created by jarydu on 3/15/17.
 */
interface ChatUser {

    String getUser();

    void sendMsg(String msg);

    void receiveMsg(ChatUser user, String msg);
}
