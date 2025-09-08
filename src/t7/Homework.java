package t7;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Какую команду вы хотоите вести");
            System.out.println("1-Добавить задачу");
            System.out.println("2-Показать все задачи");
            System.out.println("3-Удалить задачу");
            System.out.println("4-Очистить весь список задач");
            System.out.println("0-Выйти из программы");
            int commandUser = scanner.nextInt();
            if (commandUser == 1){
                System.out.println(userTask());
            } else if (commandUser == 2) {
                System.out.println(showUserTask());
            } else if (commandUser == 3) {

            } else if (commandUser == 4) {

            }else if (commandUser == 0){
                break;
            }else {
                System.out.println("Введена неправильная задача");
            }

        }
    }
    public static String userTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свою задачу");
        String task = scanner.nextLine();
        ArrayList<String> userTask = new ArrayList<>();
        userTask.add(task);
        for (int i = 0; i <userTask.size() ; i++) {
            System.out.println("Задача была добавлена: " + userTask.get(i));
        }return "";
    }
    public static String showUserTask(){
        userTask();
        for (int i = 0; i < userTask().length(); i++) {
            System.out.println(userTask());
        }return "";
    }



}
