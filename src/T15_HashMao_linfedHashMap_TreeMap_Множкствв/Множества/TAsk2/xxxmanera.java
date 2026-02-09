package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Множества.TAsk2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class xxxmanera {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        fillNames(names);
        System.out.println("Общее количество имён: " + names.size());

        Set<String> AnzahlEindeutigerNamen = new HashSet<>(names);
        System.out.println("Количество уникальных имён: " + AnzahlEindeutigerNamen.size());
    }

    private static void fillNames(List<String> names) {
        names.add("Арман");
        names.add("Пётр");
        names.add("Дамир");
        names.add("Арман");
        names.add("Дамир");
        names.add("Алуа");
        names.add("Алан");
        names.add("Максат");
    }
}

