package behavioral.mediator.chat;

/**
 * Created by jarydu on 3/15/17.
 */
interface ChatRoom {

    void addUser(ChatUser user);

    void receiveMsg(ChatUser user, String msg);
}
