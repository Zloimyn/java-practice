package T14_КоллекцияИитерфейс.Compare_сортировка.Task1;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1,Item item2){
        if (item1.price > item2.price){
            return 1;
        } else if (item1.price < item2.price) {
            return -1;
        }else {
            return 0;
        }
    }
}
