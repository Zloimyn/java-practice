package B_V2_TaskTrecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InMemoryTaskManager manager = new InMemoryTaskManager();
        InMemoryHistoryManager historyManager = new InMemoryHistoryManager();

        Task task = new Task("переезд","Купить вещи и обувь", Status.NEW);
        manager.createTask(task);

        Task task3 = new Task("переезд123","Купить виллу", Status.NEW);
        manager.createTask(task3);

        Epic epic = new Epic("Переезд", "Задачи");
        manager.createEpic(epic);

        Epic epic3 = new Epic(epic.getName(),"Переехать");
        epic3.setId(epic.getId());
        manager.updateEpic(epic3);
        System.out.println(manager.getEpic(3));

        Subtask subtask1 = new Subtask("Купить коробки", "Заехать в магазин и взять большие коробки", Status.NEW, epic.getId());
        Subtask subtask2 = new Subtask("Купить еду", "По пути заехать в магазин", Status.NEW, epic.getId());
        manager.createSubtask(subtask1);
        manager.createSubtask(subtask2);

        System.out.println(epic.getStatus());

        Epic epic2 = new Epic("Прибраться","Задачи");
        manager.createEpic(epic2);

        Subtask subtask3 = new Subtask("Пропылесосить","Купить новый пылесос", Status.NEW, epic.getId());
        manager.createSubtask(subtask3);

        System.out.println(epic2.getStatus());

        Subtask subtask4 = new Subtask(subtask1.getName(),subtask1.getDescriptions(), Status.DONE,subtask1.getEpicId());
        subtask4.setId(subtask1.getId());
        manager.updateSubtask(subtask4);

        System.out.println(epic2.getStatus());

        System.out.println("Tasks: "+ manager.allTasks() + ".Epics: " + manager.allEpics()+ ".Subtask: "+ manager.allSubtasks());


        Task task2 = new Task(task.getName(),task.getDescriptions(), Status.IN_PROGRESS);
        task2.setId(task.getId());
        manager.updateTask(task2);

        System.out.println(" ");

        manager.getEpic(3);
        manager.getSubtask(4);
        manager.getSubtask(5);
        manager.getSubtask(7);
        manager.getTask(1);

//        historyManager.add(epic);
//        historyManager.add(task3);
//        historyManager.add(task2);
//        historyManager.add(epic2);
//        historyManager.add(subtask1);

        System.out.println(historyManager.getHistory());
        System.out.println(historyManager.getSize());

        while (true){

        }
    }

    void printMenu(Scanner scanner){
        System.out.println("Введите число: ");
        System.out.println("1- Создать новую задачу");
        System.out.println("2- Создать новый эпик");
        System.out.println("3- Создать новую подзадачу");
        System.out.println("4- Найти задачу");
        System.out.println("4- Удалить задачу");
        System.out.println("5- Обновить задачу");
        System.out.println("6- Очистить список задач");
        System.out.println("7- Вывести список задач");
        System.out.println("8- Выход из программы");
    }

}