package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Множества.Task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ramshtain {
    private static List<String> allPurchases = List.of(
                "яблоки",
                "молоко",
                "колбаса",
                "огурцы",
                "сок",
                "хлеб",
                "виноград",
                "молоко",
                "йогурт",
                "хлеб",
                "пельмени"
        );

        public static void main(String[] args) {
            // переменная uniquePurchases должна содержать множество уникальных товаров
        Set<String> uniquePurchases = new HashSet<>(allPurchases);

            // допишите вывод количества уникальных товаров
            System.out.println( "За месяц было куплено " + uniquePurchases.size() + " уникальных товаров.");
            findUniquePurchases(allPurchases);
        }

        // реализуйте этот метод
        public static void findUniquePurchases(List<String> allPurchases) {
            Set<String> uniquePurchases = new HashSet<>(allPurchases);
            System.out.println("Всего товаров: " + allPurchases.size());
            System.out.println("Уникальных товаров: " + uniquePurchases.size());
    }
}

