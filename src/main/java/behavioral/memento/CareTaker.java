package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jarydu on 2/14/16.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int idx) {
        return mementoList.get(idx);
    }
}
