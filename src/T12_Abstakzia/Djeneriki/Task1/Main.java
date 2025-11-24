package T12_Abstakzia.Djeneriki.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Укажите тип данных, который будет храниться в списке
        List<Double> expenses = new ArrayList<>();
        expenses.add(100.5);
        expenses.add(500.0);
        expenses.add(1000.6);

        System.out.println("Траты пользователя:");
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println(expenses.get(i));
        }

        // Объявите список pets
        List<String> pets = new ArrayList<>();
        pets.add("Кот");
        pets.add("Хомяк");
        pets.add("Кролик");

        System.out.println("Список домашних животных:");
        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i));
        }

        // Объявите хэш-таблицу persons
        HashMap<String,Integer> persons = new HashMap<>();
        persons.put("Ваня", 30);
        persons.put("Маша", 25);
        persons.put("Петя", 19);

        System.out.println("\nСписок людей:");
        for (String person : persons.keySet()) {
            System.out.println(person + " - " + persons.get(person) + "лет");
        }
    }
}
