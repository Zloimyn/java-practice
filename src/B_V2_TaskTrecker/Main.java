package B_V2_TaskTrecker;

import java.util.ArrayList;
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

        Subtask subtask3 = new Subtask("Пропылесосить","Купить новый пылесос", Status.NEW, epic2.getId());
        manager.createSubtask(subtask3);

        System.out.println(epic2.getStatus());

        Subtask subtask4 = new Subtask(subtask1.getName(),subtask1.getDescriptions(), Status.DONE,subtask1.getEpicId());
        subtask4.setId(subtask1.getId());
        manager.updateSubtask(subtask4);

        System.out.println(epic2.getStatus());

        System.out.println("Tasks: "+ manager.allTasks() + ".Epics: " + manager.allEpics()+ ".Subtask: "+ manager.allSubtasks());

//        task2.setId(task.getId());


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
            printMenu();
            int userCommand = scanner.nextInt();
            if (userCommand == 1){
                createTask(scanner,manager);
            } else if (userCommand == 2) {
                findTasks(scanner,manager);
            } else if (userCommand == 3) {
                deletedTasks(scanner,manager);
            } else if (userCommand == 4) {
                updateTasks(scanner,manager);
            }else if (userCommand == 5){
                clearListTasks(scanner,manager);
            } else if (userCommand == 6){
                printListTasks(scanner,manager);
            } else if (userCommand == 0) {
                break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("Введите число: ");
        System.out.println("1- Создать новую задачу");
        System.out.println("2- Найти задачу");
        System.out.println("3- Удалить задачу");
        System.out.println("4- Обновить задачу");
        System.out.println("5- Очистить список задач");
        System.out.println("6- Вывести список задач");
        System.out.println("0- Выход из программы");
    }

    public static void printListChoose(){
        System.out.println("1-Tasks");
        System.out.println("2-Epics");
        System.out.println("3-Subtask");
    }

    public static void printTaskGet(Task task){
        System.out.println("Ваша задача найдена: ");
        System.out.println(task.getName());
        System.out.print(", ");
        System.out.println(task.getDescriptions());
        System.out.print(", ");
        System.out.println(task.getStatus());
    }

    public static void printEpicGet(Epic epic){
        System.out.println("Ваша задача найдена: ");
        System.out.println(epic.getName());
        System.out.print(", ");
        System.out.println(epic.getDescriptions());
        System.out.print(", ");
        System.out.println(epic.getStatus());
    }

    public static void printSubtaskGet(Subtask subtask){
        System.out.println("Ваша задача найдена: ");
        System.out.println(subtask.getName());
        System.out.print(", ");
        System.out.println(subtask.getDescriptions());
        System.out.print(", ");
        System.out.println(subtask.getStatus());
    }

    public static void createTask(Scanner scanner,InMemoryTaskManager manager){
        System.out.println("Выберете какую задачу создать: ");
        printListChoose();
        int userChoose = scanner.nextInt();
        System.out.println("Введите название задачи: ");
        String name = scanner.next();
        System.out.println("Введите описание задачи: ");
        String descriptions = scanner.next();
        if (userChoose == 1){
            Task task1 = new Task(name,descriptions,Status.NEW);
            manager.createTask(task1);
            System.out.println("Задача успешно создана: " + name);
        }else if (userChoose == 2){
            Epic epic1 = new Epic(name,descriptions,Status.NEW);
            manager.createEpic(epic1);
            System.out.println("Эпик успешно создан: " + name);
        } else if (userChoose == 3) {
            System.out.println("Введите ID эпика к которому будет присвоена подзадача: ");
            for (Epic epic : manager.allEpics()){
                System.out.print(epic.getId());
                System.out.print(" -");
                System.out.println(epic.getName());
            }
            int epicUser = scanner.nextInt();
            Subtask subtask = new Subtask(name,descriptions,Status.NEW,epicUser);
            manager.createSubtask(subtask);
            System.out.println("Подзадача успешно создана: " + name);
        }else {
            System.out.println("Такого типа задач нету!");
            return;
        }
    }

    public static void findTasks(Scanner scanner,InMemoryTaskManager manager){
        ArrayList<Task> listTasks = new ArrayList<>();
        System.out.println("1.- Найти задачу по имени или описанию");
        System.out.println("2.- Найти задачу по ID");
        int userChoose = scanner.nextInt();
        if (userChoose == 1){
            for (Task task : manager.allTasks()){
                listTasks.add(task);
            }
            for (Epic epic : manager.allEpics()){
                listTasks.add(epic);
            }
            for (Subtask subtask : manager.allSubtasks()){
                listTasks.add(subtask);
            }
            System.out.println("1.- По имени");
            System.out.println("2.- По описанию");
            int userChooseType = scanner.nextInt();
            if (userChooseType == 1){
                String nameTask = scanner.next();
                if (listTasks.equals(nameTask)){
                    System.out.println("Ваша задача найдена: ");
                }
                for (Task task : manager.allTasks()) {
                    if (task.equals(nameTask)){
                        printTaskGet(task);
                    }
                }
                for (Epic epic : manager.allEpics()) {
                    if (epic.equals(nameTask)) {
                        printEpicGet(epic);
                    }
                }
                for (Subtask subtask : manager.allSubtasks()) {
                    if (subtask.equals(nameTask)) {
                        printSubtaskGet(subtask);
                    }
                }
            } else if (userChooseType == 2) {
                String desciptionTask = scanner.next();
                for (Task task : manager.allTasks()) {
                    if (task.equals(desciptionTask)){
                        printTaskGet(task);
                    }
                }
                for (Epic epic : manager.allEpics()) {
                    if (epic.equals(desciptionTask)) {
                        printEpicGet(epic);
                    }
                }
                for (Subtask subtask : manager.allSubtasks()) {
                    if (subtask.equals(desciptionTask)) {
                        printSubtaskGet(subtask);
                    }
                }
            }else {
                System.out.println("Неверно!");
            }
        } else if (userChoose == 2) {
            System.out.println("Введите ID задачи которой вы хотите найти: ");
            int userIdSearch = scanner.nextInt();
            if (manager.getTask(userIdSearch) != null) {
                for (Task task : manager.allTasks()) {
                    if (userIdSearch == task.getId()) {
                        printTaskGet(task);
                    }
                }
            }else if (manager.getEpic(userIdSearch) != null){
                for (Epic epic : manager.allEpics()) {
                    if (userIdSearch == epic.getId()) {
                        printEpicGet(epic);
                    }
                }
            }else if (manager.getSubtask(userIdSearch) != null){
                for (Subtask subtask : manager.allSubtasks()) {
                    if (userIdSearch == subtask.getId()) {
                        printSubtaskGet(subtask);
                    }
                }
            }else {
                System.out.println("Такой задачи нету! ");
            }
        }else {
            System.out.println("Неверно!");
        }
    }

    public static void deletedTasks(Scanner scanner,InMemoryTaskManager manager){
        System.out.println("Введите тип задачи для удаления: ");
        printListChoose();
        int userTypeTask = scanner.nextInt();
        System.out.println("Введите ID задачи которой вы хотите удалить: ");
        int userIdSearch = scanner.nextInt();
        if (userTypeTask == 1){
            manager.deleteIdTask(userIdSearch);
        } else if (userTypeTask == 2) {
            manager.deleteIdSubtask(userIdSearch);
        } else if (userTypeTask == 3) {
            manager.deleteIdEpic(userIdSearch);
        }else{
            System.out.println("Такого типа задач нету! ");
        }
    }

    public static void updateTasks(Scanner scanner,InMemoryTaskManager manager){
        System.out.println("Введите тип задачи для обновления: ");
        printListChoose();
        int userTypeTask = scanner.nextInt();
        if (userTypeTask == 1){
            System.out.println("Выберете Task для обновления: ");
            for (int i = 0; i < manager.getSize(); i++) {
                if (manager.getTask(i) != null){
                    System.out.println(i + " -");
                    manager.getTask(i);
                }
            }
            int userChooseTask = scanner.nextInt();
            System.out.println("Введите название обновленной задачи: ");
            String nameTask = scanner.next();
            System.out.println("Введите описание обновленной задачи: ");
            String descriptionsTask = scanner.next();
            System.out.println("Введите статус обновленной задачи:");
            System.out.println("1 - NEW");
            System.out.println("2 - IN_PROGRESS");
            System.out.println("3 - DONE");
            int userChooseStaus = scanner.nextInt();
            if (userChooseStaus == 1){
                Status New = Status.NEW;
                Task task1 = new Task(nameTask,descriptionsTask,New);

            } else if (userChooseStaus == 2) {
                Status In = Status.IN_PROGRESS;
                Task task2 = new Task(nameTask,descriptionsTask,In);
            } else if (userChooseStaus == 3) {
                Status Done = Status.DONE;
                Task task3 = new Task(nameTask,descriptionsTask,Done);
            } else {
                System.out.println("Такого статуса нету!");
            }


        } else if (userTypeTask == 2) {

        } else if (userTypeTask == 3) {

        }else{
            System.out.println("Такого типа задач нету! ");
        }
    }

    public static void clearListTasks(Scanner scanner,InMemoryTaskManager manager){
        System.out.println("Выберете какой список задач удалить: ");
        printListChoose();
        System.out.println("4-Все");
        int userComm = scanner.nextInt();
        if (userComm == 1){
            for (int i = 0; i < manager.getSize(); i++) {
                manager.allTasks().remove(i);
            }
            System.out.println("Все задачи Task были удалены");
        } else if (userComm == 2) {
            for (int i = 0; i < manager.getSize(); i++) {
                manager.allEpics().remove(i);
            }
            System.out.println("Все задачи Epic были удалены");
        } else if (userComm == 3) {
            for (int i = 0; i < manager.getSize(); i++) {
                manager.allSubtasks().remove(i);
            }
            System.out.println("Все задачи Subtask были удалены");
        } else if (userComm == 4) {
            for (int i = 0; i < manager.getSize(); i++) {
                manager.allTasks().remove(i);
                manager.allSubtasks().remove(i);
                manager.allEpics().remove(i);
            }
            System.out.println("Все задачи были удалены");
        }
    }

    public static void printListTasks(Scanner scanner,InMemoryTaskManager manager){
        System.out.println("Выберете какой список задач вывести: ");
        printListChoose();
        System.out.println("4-Все");
        int userCom = scanner.nextInt();
        if (userCom == 1){
            manager.allTasks();
        } else if (userCom == 2) {
            manager.allEpics();
        } else if (userCom == 3) {
            manager.allSubtasks();
        } else if (userCom == 4) {
            System.out.print("Tasks: ");
            manager.allTasks();
            System.out.println(" ");
            System.out.print("Epics: ");
            manager.allEpics();
            System.out.println(" ");
            System.out.print("subtasks: ");
            manager.allSubtasks();
            System.out.println(" ");
        }
    }

}