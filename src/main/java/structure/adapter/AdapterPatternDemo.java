package structure.adapter;

/**
 * Created by jarydu on 2/3/16.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp4", "beyond the horizon!");
        player.play("vlc", "far far away");
    }
}
