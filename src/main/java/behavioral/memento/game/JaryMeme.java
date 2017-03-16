package behavioral.memento.game;

/**
 * Created by jarydu on 3/16/17.
 */
public class JaryMeme implements GameMeme {
    private int day;
    private String env;
    private String ppl;

    @Override
    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public void setEnvironment(String env) {
        this.env = env;
    }

    @Override
    public void setPeople(String ppl) {
        this.ppl = ppl;
    }

    @Override
    public String toString() {
        return "JaryMeme{" +
                "day=" + day +
                ", env='" + env + '\'' +
                ", ppl='" + ppl + '\'' +
                '}';
    }
}
