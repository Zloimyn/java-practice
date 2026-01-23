package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // хеш-таблица содержит информацию о количестве жителей в разных городах
        Map<String, Integer> citiesPopulation = new HashMap<>();
        citiesPopulation.put("Москва", 12_655_050);
        citiesPopulation.put("Лондон", 8_961_989);
        citiesPopulation.put("Нью-Йорк", 8_804_190);

        // попытаемся узнать, каким будет население Парижа через год
        String city = "Berlin";
        if (!citiesPopulation.containsKey(city)){
            System.out.println("Введите количество людей в городе: ");
            int peoples = scanner.nextInt();
            citiesPopulation.put(city,peoples);
        }
        Integer cityPopulation = citiesPopulation.get(city);
        System.out.println("Через 1 год население города " + city + " будет: " + (int)(cityPopulation * 1.01));
    }
}
