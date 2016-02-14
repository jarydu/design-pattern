package structure.adapter;

/**
 * Created by jarydu on 2/3/16.
 */
public class VlcPlayer implements AdvancedMediaPlayer{

        public void playVlc(String fileName) {
            System.out.println("Playing vlc file: " + fileName);
        }

        public void playMp4(String fileName) {
            throw new UnsupportedOperationException("cannot play mp4");
        }
}
