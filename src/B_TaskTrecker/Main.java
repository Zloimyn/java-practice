package B_TaskTrecker;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Task task = new Task("переезд","Купить вещи и обувь",Status.NEW);

        manager.createTask(task);
        manager.updateTask(task);
        manager.returnTaskId(task,1);
        manager.allTasks();
        manager.deleteIdTask(1);





    }



}
