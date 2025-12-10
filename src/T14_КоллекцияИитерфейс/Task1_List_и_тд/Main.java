package T14_КоллекцияИитерфейс.Task1_List_и_тд;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(2);
        list.add(3);

        list.remove(0);
        list.remove((Integer) 2);

        System.out.println(list);
    }
}
