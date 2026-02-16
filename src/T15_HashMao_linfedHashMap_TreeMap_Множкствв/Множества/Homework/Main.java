package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Множества.Homework;

import java.time.LocalDate;
import java.util.*;

public class Main {
    private static Set<Letter> letters = new LinkedHashSet<>();

    public static void main(String[] args) {
        // информация о письмах (в порядке занесения в систему)
        letters.add(new Letter("Джон Смит", LocalDate.of(2021, 7, 7), "текст письма №1 ..."));
        letters.add(new Letter("Аманда Линс", LocalDate.of(2021, 6, 17), "текст письма №2 ..."));
        letters.add(new Letter("Джо Кью", LocalDate.of(2021, 7, 5), "текст письма №3 ..."));
        letters.add(new Letter("Мишель Фернандес", LocalDate.of(2021, 8, 23), "текст письма №4 ..."));

        printOrderedById(letters);
        printOrderedByDateReceived(letters);
    }

    private static void printOrderedById(Set<Letter> letters) {
        System.out.println("Все письма с сортировкой по ID: ");

        for (Letter letter : letters) {
            System.out.println("    * Письмо от " + letter.authorName + " поступило " + letter.dateReceived);
        }
    }

    private static void printOrderedByDateReceived(Set<Letter> letters) {
        System.out.println("Все письма с сортировкой по дате получения: ");

        Compare compare = new Compare();
        List<Letter> letters1 = new ArrayList<>(letters);
        Collections.sort(letters1,compare);

        for (Letter letter : letters1) {
            System.out.println("    * Письмо от " + letter.authorName + " поступило " + letter.dateReceived);
        }
        // реализуйте этот метод

    }
}




//private static void printOrderedByDateReceived(Set<Letter> letters) {
//    System.out.println("Все письма с сортировкой по дате получения: ");
//
//    // 1. Создаем TreeMap. Ключ — Дата, Значение — Список писем за эту дату
//    Map<LocalDate, List<Letter>> sortedLetters = new TreeMap<>();
//
//    // 2. Раскладываем письма из нашего Set по датам в TreeMap
//    for (Letter letter : letters) {
//        LocalDate date = letter.dateReceived;
//
//        // Если такой даты еще нет в ключах, создаем для нее пустой список
//        if (!sortedLetters.containsKey(date)) {
//            sortedLetters.put(date, new ArrayList<>());
//        }
//
//        // Получаем список по дате и добавляем в него текущее письмо
//        sortedLetters.get(date).add(letter);
//    }
//
//    // 3. Выводим письма. TreeMap УЖЕ отсортировал их по датам (ключам)
//    for (List<Letter> lettersForDay : sortedLetters.values()) {
//        for (Letter letter : lettersForDay) {
//            System.out.println("    * Письмо от " + letter.authorName + " поступило " + letter.dateReceived);
//        }
//    }
//}
