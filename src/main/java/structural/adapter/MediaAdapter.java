package structural.adapter;

/**
 * Created by jarydu on 2/3/16.
 */
public class MediaAdapter implements MediaPlayer {
        private Mp4Player mp4Player = new Mp4Player();
        private VlcPlayer vlcPlayer = new VlcPlayer();

        public void play(String audioType, String fileName) {
            if (audioType.equalsIgnoreCase("mp4"))
                mp4Player.playMp4(fileName);
            else if (audioType.equalsIgnoreCase("vlc"))
                vlcPlayer.playVlc(fileName);
        }
}
