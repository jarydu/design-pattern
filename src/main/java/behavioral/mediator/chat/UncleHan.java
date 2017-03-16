package behavioral.mediator.chat;

/**
 * Created by jarydu on 3/15/17.
 */
public class UncleHan implements ChatUser {
    private final ChatRoom chatRoom;

    public UncleHan(ChatRoom cr) {
        this.chatRoom = cr;
        this.chatRoom.addUser(this);
    }

    @Override
    public String getUser() {
        return "Uncle HAN";
    }

    @Override
    public void sendMsg(String msg) {
        chatRoom.receiveMsg(this, msg);
    }

    @Override
    public void receiveMsg(ChatUser user, String msg) {
        System.out.println(String.format("Uncle Han receives: [%s]: %s", user.getUser(), msg));
    }
}
