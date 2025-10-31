import java.util.HashMap;
import java.util.Scanner;

public class Tracker {
    public static void main(String[] args) {
        HashMap<String,String> usersTasks = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        TaskMeneger taskMeneger = new TaskMeneger();

        while (true){
            printMenu();
            int command = scanner.nextInt();
            if (command == 1){
                getCommand1(usersTasks);
            } else if (command == 2) {

            }else if (command == 3) {

            }else if (command == 4) {

            }else if (command == 5) {
                getCommand5(usersTasks,scanner);
            }else if (command == 6) {

            }else if (command == 7) {

            }else if (command == 0){
                break;
            } else {
                System.out.println("Введена неверная команда");
            }
        }


    }


    static void printMenu (){
        System.out.println("1-Получение списка всех задач.");
        System.out.println("2-Удаление всех задач.");
        System.out.println("3-Получение задачи по идентификатору.");
        System.out.println("5-Создание задачи");
        System.out.println("6-Обновление");
        System.out.println("7-Удаление по идентификатору");
        System.out.println("0-Выход");
    }

    static void getCommand1(HashMap<String,String> task){
        System.out.println("Список всех задач: ");
        if (task.keySet() == null){
            System.out.println("Список задач пуст");
        }else {
            for (int i = 0; i < task.size(); i++) {
                System.out.println(task.keySet());
                i++;
            }
        }
    }

    static void getCommand5(HashMap<String,String> task, Scanner scanner){
        System.out.println("Введите имя вашей задачи: ");
        String userNameTask = scanner.next();
        System.out.println("Введите количество подзадач: ");
        int temp = scanner.nextInt();
        if (temp < 1){
            System.out.println("Вам нужно добавить подзадачу");
        }
        for (int i = 0; i < temp; i++) {
            i++;
            System.out.println("Введите "+ i + " подзадачу: ");
            String userSubtask = scanner.next();
            i--;
            task.put(userNameTask,userSubtask);
            for (int j = 0; j < task.size(); j++) {
                if (task.keySet().equals(userNameTask)){

                }
            }
        }
    }
}
