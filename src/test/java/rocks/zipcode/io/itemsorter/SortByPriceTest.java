package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {
    //should only change price var for each here
    @Test
    public void test1() {
        //given
        Item item1 = new Item(0L, "Apple", 1.0);
        Item item2 = new Item(1L, "Banana", 1.5);
        Item item3 = new Item(3L, "Cherry", 2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item1, item2, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();
        //when
        Item[] actual = itemSorter.sort(comparator);
        //then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        //given
        Item item1 = new Item(0L, "Apple", 3.5);
        Item item2 = new Item(1L, "Banana", 2.3);
        Item item3 = new Item(2L, "Cherry", 1.8);
        Item item4 = new Item(3L, "Donuts", 5.3);
        Item[] itemsToSort = {item1, item4, item3, item2};
        Item[] expected = {item3, item2, item1, item4};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();
        //when
        Item[] actual = itemSorter.sort(comparator);
        //then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        //given
        Item item1 = new Item(0L, "Apple", 1.0);
        Item item2 = new Item(1L, "Banana", 4.2);
        Item item3 = new Item(2L, "Cherry", 2.3);
        Item item4 = new Item(3L, "Donuts", 6.4);
        Item[] itemsToSort = {item3, item1, item4, item2};
        Item[] expected = {item1, item3, item2, item4};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();
        //when
        Item[] actual = itemSorter.sort(comparator);
        //then
        Assert.assertArrayEquals(expected, actual);
    }
    //check what happens when 2 items have the same price?
    @Test
    public void test4() {
        //given

        //when

        //then

    }

    @Test
    public void test5() {
        //given

        //when

        //then

    }
}
