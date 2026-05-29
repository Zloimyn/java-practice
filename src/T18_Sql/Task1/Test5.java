package T18_Sql.Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


public class Test5 {
    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) throws IOException {
        // создание файла testFile
//        Path testFile = Files.createFile(Paths.get(HOME, "testFile.txt"));
//        if (Files.exists(Paths.get(HOME, "testFile.txt"))) {
//            System.out.println("Файл успешно создан.");
//        }

        Path file = Paths.get("C:\\Users\\s6566\\testFile.txt");

//        // создание директории testDirectory
//        Path testDirectory = Files.createDirectory(Paths.get(HOME, "testDirectory"));
//        if (Files.exists(Paths.get(HOME, "testDirectory"))) {
//            System.out.println("Директория успешно создана.");
//        }

        // перемещение файла testFile в директорию testDirectory
        file = Files.move(file, Paths.get(HOME, "testDirectory", "testFile.txt"), REPLACE_EXISTING);
        if (Files.exists(Paths.get(HOME, "testDirectory", "testFile.txt"))) {
            System.out.println("Файл перемещён в testDirectory.");
        }

        // удаление файла
//        Files.delete(testFile);
//        if (!Files.exists(Paths.get(HOME, "testDirectory", "testFile.txt"))) {
//            System.out.println("Тестовый файл удалён.");
//        }
//
//        // удаление пустой директории
//        Files.delete(testDirectory);
//        if (!Files.exists(Paths.get(HOME, "testDirectory"))) {
//            System.out.println("Директория удалена.");
//        }
    }
}
