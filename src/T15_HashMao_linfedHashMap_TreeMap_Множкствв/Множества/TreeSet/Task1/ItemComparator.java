package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Множества.TreeSet.Task1;

import java.util.Comparator;

public class ItemComparator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        if (o1.priceInUsd > o2.priceInUsd){
            return 1;
        } else if (o2.priceInUsd > o1.priceInUsd) {
            return -1;
        }else {
            return 0;
        }
    }

}
