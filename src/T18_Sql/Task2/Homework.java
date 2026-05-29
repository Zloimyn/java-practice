package T18_Sql.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while_loop:
        while (true) {
            printMenu();
            String command = scanner.nextLine();

            System.out.println("Введите путь к файлу/директории: ");
            String enteredPath = scanner.nextLine();
            Path path = Paths.get(enteredPath);

            // Объявите переменную path с типом Path.
            // Выполните действия в зависимости от введённой команды.
            switch (command) {
                case "exit":
                    System.out.println("Выход.");
                    break while_loop;
                case "ls":
                    try {
                        System.out.println("Содержимое директории: ");
                        for (Path element : Files.newDirectoryStream(path)) {
                            System.out.println("- " + element.getFileName());
                        }
                        // выведите список элементов директории
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при запросе содержимого директории.");
                        e.printStackTrace();
                    }
                    break;

                case "mkdir":
                    try {
                        Files.createDirectory(path);
                        System.out.println("Директория создана");
                        // создайте директорию
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при создании директории.");
                        e.printStackTrace();
                    }
                    break;
                case "touch":
                    try {
                        Files.createFile(path);
                        System.out.println("Файл успешно создан.");
                        // создайте файл
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при создании файла.");
                        e.printStackTrace();
                    }
                    break;
                case "rename":
                    System.out.println("Введите новое имя файла/директории: ");
                    String newName = scanner.nextLine();

                    try {
                        Path Path = path.resolveSibling(newName);

                        Files.move(path, Path);
                        System.out.println("Успешно переименовано!");
                        // переименуйте файл
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при переименовании файла/директории.");
                        e.printStackTrace();
                    }
                    break;
                case "rm_file":
                    try {
                        if (!Files.isDirectory(path)) {
                            Files.delete(path);
                            System.out.println("Элемент удален.");
                            // удалите файл
                        }
                        else {
                            System.out.println("С помощью этой команды можно удалить только файл!");
                        }
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при удалении файла.");
                        e.printStackTrace();
                    }
                    break;
                case "move":
                    System.out.println("Введите полный путь, куда переместить файл: ");
                    String name = scanner.nextLine();
                    Path Path = Paths.get(name);

                    try {
                        Files.move(path, Path);
                        System.out.println("Элемент успешно перемещен.");
                    }
                    catch (IOException e) {
                        System.out.println("Произошла ошибка при перемещении.");
                    }
                    break;
                default:
                    System.out.println("Извините, такой команды пока нет.");
            }

        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("ls - посмотреть содержимое директории.");
        System.out.println("mkdir - создать директорию.");
        System.out.println("touch - создать файл.");
        System.out.println("rename - переименовать директорию/файл.");
        System.out.println("rm_file - удалить файл.");
        System.out.println("move - переместить файл");
        System.out.println("exit - выход.");
    }
}
