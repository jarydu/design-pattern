package behavioral.interpreter.language;

/**
 * Created by jarydu on 3/15/17.
 */
public class FrenchContext implements LangContext {
    private final String ctx;

    public FrenchContext(String ctx) {
        this.ctx = ctx;
    }

    @Override
    public String getContext() {
        return ctx;
    }
}
