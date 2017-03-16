package behavioral.memento.game;

/**
 * Created by jarydu on 3/16/17.
 */
public interface Game {

    void save(GameMeme gameMeme, int day);

    void store(int day);
}
