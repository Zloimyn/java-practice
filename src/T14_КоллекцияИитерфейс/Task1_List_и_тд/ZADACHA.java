package T14_КоллекцияИитерфейс.Task1_List_и_тд;

import java.util.ArrayList;
import java.util.List;

public class ZADACHA {
    public static void main(String[] args) {
        final List<String> cats = new ArrayList<>();

        cats.add("Рыжик");
        cats.add("Абай");
        cats.add("Феликс");
        cats.add("Моцарт");

        System.out.println(cats);

        cats.remove(1);
        cats.set(2,"Лев");
        System.out.println(cats);
    }
}
