import java.util.HashMap;
import java.util.Scanner;

public class TaskMeneger {

    static void getCommand1(HashMap<String,String> task){
        System.out.println("Список всех задач: ");
        if (task.keySet() == null){
            System.out.println("Список задач пуст");
        }else {
            for (int i = 0; i < task.size(); i++) {
                System.out.println(task.keySet());
            }
        }
    }

    static void getCommand5(HashMap<String,String> task, Scanner scanner){
        System.out.println("Введите имя вашей задачи: ");
        String userNameTask = scanner.next();
        System.out.println("Введите количество подзадач: ");
        int temp = scanner.nextInt();
        for (int i = 0; i < temp; i++) {
            i++;
            System.out.println("Введите "+ i + " подзадачу: ");
            String userSubtask = scanner.next();
            i--;
            task.put(userNameTask,userSubtask);
        }
    }

}
