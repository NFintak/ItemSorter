package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {
    public int compare(Item one, Item two) {
        return one.getId().compareTo(two.getId());
    }
}
