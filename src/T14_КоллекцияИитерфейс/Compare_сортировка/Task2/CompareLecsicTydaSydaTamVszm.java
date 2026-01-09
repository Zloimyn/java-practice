package T14_КоллекцияИитерфейс.Compare_сортировка.Task2;

import java.util.Comparator;

public class CompareLecsicTydaSydaTamVszm implements Comparator<String> {
    @Override
    public int compare(String item1, String item2){
        return String.CASE_INSENSITIVE_ORDER.compare(item1, item2);
    }
}
