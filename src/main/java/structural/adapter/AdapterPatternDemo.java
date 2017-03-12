package structural.adapter;

/**
 *
 * Pattern Structure
 *
 * I -> MediaPlayer
 * I -> AdvancedMediaPlayer
 *
 * AudioPlayer -> MediaPlayer
 * Mp4Player -> AdvancedMediaPlayer
 * VlcPlayer -> AdvancedMediaPlayer
 *
 *
 *
 *
 * Created by jarydu on 2/3/16.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp4", "beyond the horizon!");
        player.play("vlc", "far far away");
    }
}
