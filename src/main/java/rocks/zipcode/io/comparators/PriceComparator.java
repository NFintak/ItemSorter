package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    public int compare(Item one, Item two) {
        return one.getPrice().compareTo(two.getPrice());
    }
}
