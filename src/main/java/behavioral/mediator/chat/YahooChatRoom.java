package behavioral.mediator.chat;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by jarydu on 3/15/17.
 */
public class YahooChatRoom implements ChatRoom {
    List<ChatUser> users = Lists.newArrayList();

    @Override
    public void addUser(ChatUser user) {
        users.add(user);
    }

    @Override
    public void receiveMsg(ChatUser user, String msg) {
        for (ChatUser u : users) {
            if (u != user) {
                u.receiveMsg(user, msg);
            }
        }
    }

    public static void main(String[] args) {
        YahooChatRoom cr = new YahooChatRoom();
        ChatUser andy = new Andy(cr);
        ChatUser jary = new Jary(cr);
        ChatUser johnny = new Johnny(cr);
        ChatUser uncleHan = new UncleHan(cr);

        andy.sendMsg("Come on Babe!");

    }
}
