package behavioral.mediator.chat;

/**
 * Created by jarydu on 3/15/17.
 */
public class Jary implements ChatUser {
    private final ChatRoom chatRoom;

    public Jary(ChatRoom cr) {
        this.chatRoom = cr;
        this.chatRoom.addUser(this);
    }

    @Override
    public String getUser() {
        return "JARY";
    }

    @Override
    public void sendMsg(String msg) {
        chatRoom.receiveMsg(this, msg);
    }

    @Override
    public void receiveMsg(ChatUser user, String msg) {
        System.out.println(String.format("Jary receives: [%s]: %s", user.getUser(), msg));
    }
}
