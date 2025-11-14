package B_TaskTrecker;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Task task = new Task("переезд","Купить вещи и обувь",Status.NEW);
        manager.createTask(task);


        Epic epic = new Epic("Переезд", "Задачи");
        manager.createEpic(epic);

        Subtask subtask1 = new Subtask("Купить коробки", "Заехать в магазин и взять большие коробки", Status.NEW, epic.getId());
        Subtask subtask2 = new Subtask("Купить еду", "По пути заехать в магазин", Status.NEW, epic.getId());
        manager.createSubtask(subtask1);
        manager.createSubtask(subtask2);

        System.out.println(epic.getStatus());

        manager.setStatus(subtask1,Status.DONE);
        manager.updateSubtask(subtask1);

        System.out.println(epic.getStatus());

        Epic epic2 = new Epic("Прибраться","Задачи");
        manager.createEpic(epic2);

        Subtask subtask3 = new Subtask("Пропылесосить","Купить новый пылесос",Status.NEW, epic.getId());
        manager.createSubtask(subtask3);

        System.out.println(epic2.getStatus());

        Subtask subtask4 = new Subtask(subtask1.getName(),subtask1.getDescriptions(),Status.DONE,subtask1.getEpicId());
        manager.updateSubtask(subtask4);

        System.out.println(epic2.getStatus());

        System.out.println("Tasks: "+ manager.allTasks() + ".Epics: " + manager.allEpics()+ ".Subtask: "+ manager.allSubtasks());

        manager.deleteIdTask(1);
        manager.deleteIdEpic(2);

        Task task1 = new Task(task.getName(),task.getDescriptions(),Status.IN_PROGRESS);
        manager.updateTask(task1,task);

        System.out.println(manager.allTasks() + " " + manager.allEpics());
    }

}
