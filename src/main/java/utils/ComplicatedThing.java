package utils;

/**
 *
 * DO NOT DO FANCY THING in CONSTRUCTOR
 * Created by jarydu on 3/10/17.
 */
public class ComplicatedThing {

    private DependencyInjClass dependencyInjClass;

    public static ComplicatedThing instance(DependencyInjClass djc) throws Exception {
        ComplicatedThing ini = new ComplicatedThing(djc);
        ini.init();

        return ini;
    }

    private ComplicatedThing(DependencyInjClass djc) {
        this.dependencyInjClass = djc;
    }

    private void init() throws Exception {
        // Long processing
        Thread.sleep(1000);
        throw new JDException("This ARG is invalid");
    }

    public static void main(String[] args) throws Exception {
        ComplicatedThing init = ComplicatedThing.instance(new DependencyInjClass());
    }

    public static class DependencyInjClass {

        public DependencyInjClass() {

        }
    }
}
