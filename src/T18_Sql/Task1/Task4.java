package T18_Sql.Task1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Task4 {
    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) {
        Path testFilePath = Paths.get(HOME, "test", "file.txt");

        System.out.println("Информация о файле: ");
        System.out.println("-имя:" + testFilePath.getFileName());
        System.out.println("-корневая директория: " + testFilePath.getRoot());
        System.out.println("-родительская директория: " + testFilePath.getParent());

        System.out.println("Элементы пути: ");
        for (Path element : testFilePath){
            System.out.println("-элемент пути: " + element);
        }
    }
}
