package behavioral.memento.game;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * Created by jarydu on 3/16/17.
 */
public class HaloGame implements Game {
    private final Map<Integer, GameMeme> memes = Maps.newHashMap();
    private GameMeme state = null;

    @Override
    public void save(GameMeme gameMeme, int day) {
        memes.put(day, gameMeme);
        state = gameMeme;
    }

    @Override
    public void store(int day) {
        if (memes.containsKey(day)) {
            state = memes.get(day);
        } else {
            throw new RuntimeException("State does not exist");
        }
    }

    @Override
    public String toString() {
        return "HaloGame{" +
                " state=" + state +
                '}';
    }

    public static void main(String[] args) {
        Game newGame = new HaloGame();

        GameMeme dayOne = new JaryMeme();
        dayOne.setDay(1);
        dayOne.setEnvironment("China");
        dayOne.setPeople("Many");

        newGame.save(dayOne, 1);

        GameMeme dayTwo = new JaryMeme();
        dayTwo.setDay(2);
        dayTwo.setEnvironment("USA");
        dayTwo.setPeople("A FEW");

        newGame.save(dayTwo, 2);

        GameMeme dayThree = new JaryMeme();
        dayThree.setDay(3);
        dayThree.setEnvironment("India");
        dayThree.setPeople("A LOT");

        newGame.save(dayThree, 3);

        System.out.println(newGame);
        System.out.println();
        newGame.store(1);
        System.out.println(newGame);

    }
}
