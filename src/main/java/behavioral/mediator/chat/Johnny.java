package behavioral.mediator.chat;

/**
 * Created by jarydu on 3/15/17.
 */
public class Johnny implements ChatUser {
    private final ChatRoom chatRoom;

    public Johnny(ChatRoom cr) {
        this.chatRoom = cr;
        this.chatRoom.addUser(this);
    }

    @Override
    public String getUser() {
        return "JOHNNY";
    }

    @Override
    public void sendMsg(String msg) {
        chatRoom.receiveMsg(this, msg);
    }

    @Override
    public void receiveMsg(ChatUser user, String msg) {
        System.out.println(String.format("Johnny receives: [%s]: %s", user.getUser(), msg));
    }
}
