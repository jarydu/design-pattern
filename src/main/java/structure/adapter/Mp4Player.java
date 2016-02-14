package structure.adapter;

/**
 * Created by jarydu on 2/3/16.
 */
public class Mp4Player implements AdvancedMediaPlayer {
        public void playVlc(String fileName) {
            throw new UnsupportedOperationException("cannot play vlc");
        }

        public void playMp4(String fileName) {
            System.out.println("Playing mp4 file: " + fileName);
        }
}
