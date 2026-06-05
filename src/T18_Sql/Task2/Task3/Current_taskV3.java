package T18_Sql.Task2.Task3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Current_taskV3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество участников: ");
        int playersNumber = scanner.nextInt();

        List<String> words = readWordsFromFile("words.txt");

        // Если слов меньше, чем участников, то выведите сообщение:
        // "Недостаточно слов в файле. Добавьте слова и обновите файл."
        // и завершите выполнение программы
        if (words.size() < playersNumber){
            System.out.println("Недостаточно слов в файле. Добавьте слова и обновите файл");
            return;
        }

        // воспользуйтесь статическим методом Collections.shuffle(List<?> list),
        // чтобы поменять порядок слов случайным образом
        Collections.shuffle(words);

        int wordsNumber = words.size() / playersNumber;

        for (int i = 0; i < playersNumber; i++) {
            String filename = String.format("player%s.txt", i + 1);
            List<String> subList = words.subList(i * wordsNumber, (i + 1) * wordsNumber);

            writeListToFile(subList, filename);
        }

        System.out.println("Карточки готовы!");
    }

    private static List<String> readWordsFromFile(String filename) {
        List<String> words = new ArrayList<>();
        try(BufferedReader fileReader = new BufferedReader(new FileReader(filename))){
            while (fileReader.ready()){
                words.add(fileReader.readLine());
            }
        }catch (IOException  e){
            System.out.println("Произошла ошибка во время чтения файла.");
            return null;
        }
        // добавьте построчное чтение из файла с помощью BufferedReader
        // в случае ошибки выведите сообщение: "Произошла ошибка во время чтения файла."
        return words;
    }

    private static void writeListToFile(List<String> list, String filename) {
        try(FileWriter fileWriter = new FileWriter(filename)){
            for (String word : list) {
                fileWriter.write(word + "\n");
            }
        }catch (IOException e) {
            System.out.println("Произошла ошибка во время записи файла:" + e);
        }
        // добавьте запись слов в файл с помощью FileWriter
        // в случае ошибки выведите сообщение: "Произошла ошибка во время записи файла."
    }
}
