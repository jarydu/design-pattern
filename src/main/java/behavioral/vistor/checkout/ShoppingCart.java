package behavioral.vistor.checkout;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * Created by jarydu on 3/14/17.
 */
public class ShoppingCart implements Vistorable {
    private Map<Item, Integer> items = Maps.newHashMap();

    @Override
    public void checkout(Vistor vistor) {
        for (Item item : items.keySet()) {
            for (int i = 0; i < items.get(item); i++) {
                vistor.add(item.getPrice());
            }
        }
    }

    @Override
    public void add(Item item) {
        if (!items.containsKey(item)) {
            items.put(item, 1);
            return;
        }

        items.put(item, items.get(item) + 1);
    }

    @Override
    public void remove(Item item) {
        if (items.containsKey(item)) {
            items.put(item, items.get(item) - 1);
        }
    }
}
