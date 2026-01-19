package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Homework;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> notes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество слов, которые вы хотите добавить: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Введите слово и его перевод через знак '-': ");
            String ersteÜbersetzung = scanner.next();
            System.out.print("-");
            String zweiteÜbersetzung = scanner.next();
            notes.put(ersteÜbersetzung,zweiteÜbersetzung);
            notes.put(zweiteÜbersetzung,ersteÜbersetzung);
        }

        findWords(notes,scanner);
    }
    static void findWords(HashMap<String,String> notes,Scanner scanner) {
        System.out.println("Введите слово для перевода: ");
        String userName = scanner.next();
        if (notes.containsKey(userName)){
            System.out.println("Слово переводится: " + notes.get(userName));
        } else {
            System.out.println("Такого слова нету");
        }
    }
}
