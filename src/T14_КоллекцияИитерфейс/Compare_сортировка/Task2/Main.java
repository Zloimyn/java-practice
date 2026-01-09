package T14_КоллекцияИитерфейс.Compare_сортировка.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Груша");

        System.out.println(fruits); // [Банан, Апельсин, Яблоко, Груша]

        CompareLecsicTydaSydaTamVszm compareLecsicTydaSydaTamVszm = new CompareLecsicTydaSydaTamVszm();
        // Вызовите компаратор String.CASE_INSENSITIVE_ORDER
        fruits.sort(compareLecsicTydaSydaTamVszm);

        System.out.println(fruits); // [Апельсин, Банан, Груша, Яблоко]
    }
}
