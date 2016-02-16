package structural.adapter;

/**
 * Created by jarydu on 2/3/16.
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter adapter = new MediaAdapter();

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc"))
            adapter.play(audioType, fileName);
        else if (audioType.equalsIgnoreCase("mp4"))
            adapter.play(audioType, fileName);
    }
}
