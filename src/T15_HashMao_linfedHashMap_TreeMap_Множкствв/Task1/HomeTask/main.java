package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Task1.HomeTask;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HashMap<String,String> notes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество слов, которые вы хотите добавить: ");
        int userInt = scanner.nextInt();
        for (int i = 0; i < userInt; i++) {
            System.out.println("Введите слово и его перевод через знак '-': ");
            String ErsteÜbersetzung = scanner.next();
            System.out.print("-");
            String ZweiteÜbersetzung = scanner.next();
            notes.put(ErsteÜbersetzung,ZweiteÜbersetzung);
        }

        findWord(notes,scanner);

    }

    static void findWord(HashMap<String,String> findNotes,Scanner scanner){
        System.out.println("Введите слово для перевода:");
        String userName = scanner.next();
        for (int i = 0; i < findNotes.size(); i++) {
            if (findNotes.containsKey(userName)){
                System.out.println("Слово переводится: " + findNotes.values());
            } else if (findNotes.containsValue(userName)) {
                System.out.println("Слово переводится: " + findNotes.get(i));
            }else {
                System.out.println("Такого слова нету");
                break;
            }
        }
    }

}
