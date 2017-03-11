package creational.singleton;

/**
 * Created by jarydu on 3/11/17.
 */
public class SingletonMan {
    private int val;

    // eager singleton
    public static SingletonMan instance = new SingletonMan(12);

    // pay attention into volatile
    private static volatile SingletonMan single = null;

    // lazy singleton
    public static SingletonMan getInstance() {
        if (single == null) {
            synchronized (SingletonMan.class) {
                if (single == null) {
                    single = new SingletonMan(1);
                }
            }
        }

        return single;
    }



    public SingletonMan(int val) {
        this.val = val;
    }

}
