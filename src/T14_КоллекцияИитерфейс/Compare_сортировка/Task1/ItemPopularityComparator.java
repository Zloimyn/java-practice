package T14_КоллекцияИитерфейс.Compare_сортировка.Task1;

import java.util.Comparator;

public class ItemPopularityComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1,Item item2){
        if (item1.popularity > item2.popularity){
            return 1;
        } else if (item1.popularity < item2.popularity) {
            return -1;
        }else {
            return 0;
        }
    }

//    @Override
//    public int compare(Item item1,Item item2){
//        if (item1.popularity > item2.popularity){
//            return item1.popularity - item2.popularity;
//        }
//    }
}
