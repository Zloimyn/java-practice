package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Множества.Homework;

import java.time.LocalDate;
import java.util.Comparator;

public class Compare implements Comparator<Letter> {
    @Override
    public int compare(Letter o1, Letter o2){
        return o1.dateReceived.compareTo(o2.dateReceived);
    }
}
