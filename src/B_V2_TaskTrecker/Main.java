package B_V2_TaskTrecker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
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
                System.out.println(printGet(findTasks(scanner,manager)));
            } else if (userCommand == 3) {
                deletedTasks(scanner,manager);
            } else if (userCommand == 4) {
//                updateTasks(scanner,manager);
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

    public static String printGet(Task task){
        return "Имя: " + task.getName() + ". Описание: " + task.getDescriptions() + ". Статус: " + task.getStatus() + ". Id: " + task.getId();
    }

    public static String printGet(Epic epic){
        return "Имя: " + epic.getName() + ". Описание: " + epic.getDescriptions() + ". Статус: " + epic.getStatus() + ". Id: " + epic.getId() + ". Id subtask: " + epic.getSubtaskIds();
    }

    public static String printGet(Subtask subtask){
        return "Имя: " + subtask.getName() + ". Описание: " + subtask.getDescriptions() + ". Статус: " + subtask.getStatus() + ". Id: " + subtask.getId() + ". Id epic: " + subtask.getEpicId();
    }

    public static Task findTasksName(String nameOrDescption,HashMap<Integer,Task> mapaTasks){
        Task task11 = new Task(null,null,null);
            if (nameOrDescption == null){
                return task11;
            }
            for (Task task : mapaTasks.values()){
                if (task.getName().equals(nameOrDescption)){
                    return (task);
                }
            }
            for (Task task : mapaTasks.values()){
                if (task.getDescriptions().equals(nameOrDescption)){
                    return (task);
                }
            }
            return task11;
    }

    static Task findTasksId(int userNum,HashMap<Integer,Task> mapaTasks){
        if (mapaTasks.containsKey(userNum)){
            return (mapaTasks.get(userNum));
        }else {
            Task task11 = new Task(null,null,null);
            return task11;
        }
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
        }
    }

    public static Task findTasks(Scanner scanner,InMemoryTaskManager manager){
        HashMap<Integer,Task> mapaTasks = new HashMap<>();
        for (Task task : manager.allTasks()){
            mapaTasks.put(task.getId(), task);
        }
        for (Epic epic : manager.allEpics()){
            mapaTasks.put(epic.getId(), epic);
        }
        for (Subtask subtask : manager.allSubtasks()){
            mapaTasks.put(subtask.getId(), subtask);
        }
        System.out.println("1.- Найти задачу по имени или описанию");
        System.out.println("2.- Найти задачу по ID");
        int userChoose = scanner.nextInt();
        if (userChoose == 1){
            System.out.println("Введи имя или описание: ");
            String userNum = scanner.next();
            return findTasksName(userNum,mapaTasks);
        } else if (userChoose == 2) {
            System.out.println("Введите ID задачи: ");
            int userNum = scanner.nextInt();
            return findTasksId(userNum,mapaTasks);
        }else {
            Task task11 = new Task(null,null,null);
            System.out.println("Неверно!");
            return task11;
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

//    public static void updateTasks(Scanner scanner,InMemoryTaskManager manager){
//        System.out.println("Введите тип задачи для обновления: ");
//        printListChoose();
//        int userTypeTask = scanner.nextInt();
//        if (userTypeTask == 1){
//            int temp = 1;
//            HashMap<Integer,String> idTasks = new HashMap<>();
//            System.out.println("Выберете Task для обновления: ");
//            for (Task task : manager.allTasks()) {
//                System.out.print(temp + ".-");
//                System.out.println(task.getName());
//                idTasks.put(task.getId(), task.getName());
//                temp++;
//            }
//            int userChooseTask = scanner.nextInt();
//            System.out.println("Введите название обновленной задачи: ");
//            String nameTask = scanner.next();
//            System.out.println("Введите описание обновленной задачи: ");
//            String descriptionsTask = scanner.next();
//            System.out.println("Введите статус обновленной задачи:");
//            System.out.println("1 - NEW");
//            System.out.println("2 - IN_PROGRESS");
//            System.out.println("3 - DONE");
//            int userChooseStaus = scanner.nextInt();
//            if (userChooseStaus == 1){
//                Task task1 = new Task(nameTask,descriptionsTask,Status.NEW);
//                manager.createTask(task1);
//
//            } else if (userChooseStaus == 2) {
//                Task task2 = new Task(nameTask,descriptionsTask,Status.IN_PROGRESS);
//                manager.createTask(task2);
//            } else if (userChooseStaus == 3) {
//                Task task3 = new Task(nameTask,descriptionsTask,Status.DONE);
//                manager.createTask(task3);
//            } else {
//                System.out.println("Такого статуса нету!");
//            }
//        } else if (userTypeTask == 2) {
//            int temp = 1;
//            HashMap<Integer,String> idEpics = new HashMap<>();
//            System.out.println("Выберете Epic для обновления: ");
//            for (Epic epic : manager.allEpics()) {
//                System.out.print(temp + ".-");
//                System.out.println(epic.getName());
//                idEpics.put(epic.getId(), epic.getName());
//                temp++;
//            }
//            int userChooseTask = scanner.nextInt();
//            System.out.println("Введите название обновленной задачи: ");
//            String nameEpic = scanner.next();
//            System.out.println("Введите описание обновленной задачи: ");
//            String descriptionsEpic = scanner.next();
//            System.out.println("Введите статус обновленной задачи:");
//            System.out.println("1 - NEW");
//            System.out.println("2 - IN_PROGRESS");
//            System.out.println("3 - DONE");
//            int userChooseStaus = scanner.nextInt();
//            if (userChooseStaus == 1){
//                Epic epic = new Epic(nameEpic, descriptionsEpic, Status.NEW);
//                manager.createEpic(epic);
//
//            } else if (userChooseStaus == 2) {
//                Epic epic = new Epic(nameEpic, descriptionsEpic, Status.IN_PROGRESS);
//                manager.createEpic(epic);
//
//            } else if (userChooseStaus == 3) {
//                Epic epic = new Epic(nameEpic, descriptionsEpic, Status.DONE);
//                manager.createEpic(epic);
//
//            } else {
//                System.out.println("Такого статуса нету!");
//            }
//        } else if (userTypeTask == 3) {
//            int temp = 1;
//            HashMap<Integer,String> idSubtasks = new HashMap<>();
//            System.out.println("Выберете Subtask для обновления: ");
//            for (Subtask subtask : manager.allSubtasks()) {
//                System.out.print(temp + ".-");
//                System.out.println(subtask.getName());
//                idSubtasks.put(subtask.getId(), subtask.getName());
//                temp++;
//            }
//            int userChooseTask = scanner.nextInt();
//            int epicId = 0;
//            System.out.println("Введите название обновленной задачи: ");
//            String nameSubtask = scanner.next();
//            System.out.println("Введите описание обновленной задачи: ");
//            String descriptionsSubtask = scanner.next();
//            System.out.println("Введите статус обновленной задачи:");
//            System.out.println("1 - NEW");
//            System.out.println("2 - IN_PROGRESS");
//            System.out.println("3 - DONE");
//            int userChooseStaus = scanner.nextInt();
//            if (userChooseStaus == 1){
//                Subtask subtask = new Subtask(nameSubtask, descriptionsSubtask, Status.NEW, );
//                manager.createSubtask(subtask);
//
//            } else if (userChooseStaus == 2) {
//                Subtask subtask = new Subtask(nameSubtask, descriptionsSubtask, Status.NEW, );
//                manager.createSubtask(subtask);
//
//            } else if (userChooseStaus == 3) {
//                Subtask subtask = new Subtask(nameSubtask, descriptionsSubtask, Status.NEW, );
//                manager.createSubtask(subtask);
//
//            } else {
//                System.out.println("Такого статуса нету!");
//            }
//        }else{
//            System.out.println("Такого типа задач нету! ");
//        }
//    }

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