package task_tracker.new_ver;

import task_tracker.new_ver.service.InMemoryTaskManager;
import task_tracker.new_ver.model.Epic;
import task_tracker.new_ver.model.Status;
import task_tracker.new_ver.model.Subtask;
import task_tracker.new_ver.model.Task;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InMemoryTaskManager manager = new InMemoryTaskManager();

        while (true) {
            printMenu();
            int userCommand = scanner.nextInt();

            if (userCommand == 1) {
                createTask(scanner, manager);
            } else if (userCommand == 2) {
                System.out.println(findTasks(scanner, manager));
            } else if (userCommand == 3) {
                deletedTasks(scanner, manager);
            } else if (userCommand == 4) {
                updateTasks(scanner,manager);
            } else if (userCommand == 5) {
                clearListTasks(scanner, manager);
            } else if (userCommand == 6) {
                printListTasks(scanner, manager);
            } else if (userCommand == 0) {
                break;
            }
        }

    }

    public static void printMenu() {
        System.out.println("Введите число: ");
        System.out.println("1- Создать новую задачу");
        System.out.println("2- Найти задачу");
        System.out.println("3- Удалить задачу");
        System.out.println("4- Обновить задачу");
        System.out.println("5- Очистить список задач");
        System.out.println("6- Вывести список задач");
        System.out.println("0- Выход из программы");
    }

    public static void printListChoose() {
        System.out.println("1-Tasks");
        System.out.println("2-Epics");
        System.out.println("3-Subtask");
    }


    public static Task findTasksName(String nameOrDescption, HashMap<Integer, Task> mapaTasks) {

        if (nameOrDescption == null) {
            return null;
        }

        for (Task task : mapaTasks.values()) {
            if (task.getName().equals(nameOrDescption) || task.getDescriptions().equals(nameOrDescption)) {
                return task;
            }
        }

        return null;

    }

    public static Task findTasksId(int taskId, HashMap<Integer, Task> mapaTasks) {
        return mapaTasks.get(taskId);
    }

    public static void createTask(Scanner scanner, InMemoryTaskManager manager) {
        System.out.println("Выберете какую задачу создать: ");
        printListChoose();
        int userChoose = scanner.nextInt();

        System.out.println("Введите название задачи: ");
        String name = scanner.next();

        System.out.println("Введите описание задачи: ");
        String descriptions = scanner.next();

        if (userChoose == 1) {
            Task task1 = new Task(name, descriptions);
            manager.createTask(task1);
            System.out.println("Задача успешно создана: " + name);

        } else if (userChoose == 2) {
            Epic epic1 = new Epic(name, descriptions);
            manager.createEpic(epic1);
            System.out.println("Эпик успешно создан: " + name);

        } else if (userChoose == 3) {
            System.out.println("Введите ID эпика к которому будет присвоена подзадача: ");
            for (Epic epic : manager.allEpics()) {
                System.out.print(epic.getId());
                System.out.print(" -");
                System.out.println(epic.getName());
            }

            int epicUser = scanner.nextInt();
            Subtask subtask = new Subtask(name, descriptions, Status.NEW, epicUser);
            manager.createSubtask(subtask);
            System.out.println("Подзадача успешно создана: " + name);

        } else {
            System.out.println("Такого типа задач нету!");
        }
    }

    public static Task findTasks(Scanner scanner, InMemoryTaskManager manager) {
        HashMap<Integer, Task> mapaTasks = new HashMap<>();

        for (Task task : manager.allTasks()) {
            mapaTasks.put(task.getId(), task);
        }
        for (Epic epic : manager.allEpics()) {
            mapaTasks.put(epic.getId(), epic);
        }
        for (Subtask subtask : manager.allSubtasks()) {
            mapaTasks.put(subtask.getId(), subtask);
        }

        System.out.println("1.- Найти задачу по имени или описанию");
        System.out.println("2.- Найти задачу по ID");

        int userChoose = scanner.nextInt();
        if (userChoose == 1) {
            System.out.println("Введи имя или описание: ");
            String userNum = scanner.next();
            return findTasksName(userNum, mapaTasks);
        } else if (userChoose == 2) {
            System.out.println("Введите ID задачи: ");
            int userNum = scanner.nextInt();
            return findTasksId(userNum, mapaTasks);
        } else {
            System.out.println("Неверно!");
            return null;
        }
    }

    public static void deletedTasks(Scanner scanner, InMemoryTaskManager manager) {
        System.out.println("Введите тип задачи для удаления: ");
        printListChoose();
        int userTypeTask = scanner.nextInt();

        System.out.println("Введите ID задачи которой вы хотите удалить: ");
        int userIdSearch = scanner.nextInt();
        if (userTypeTask == 1) {
            manager.deleteTask(userIdSearch);
        } else if (userTypeTask == 2) {
            manager.deleteSubtask(userIdSearch);
        } else if (userTypeTask == 3) {
            manager.deleteEpic(userIdSearch);
        } else {
            System.out.println("Такого типа задач нету! ");
        }
    }

    public static void updateTasks(Scanner scanner, InMemoryTaskManager manager) {
        System.out.println("Введите тип задачи для обновления: ");
        printListChoose();
        int userTypeTask = scanner.nextInt();

        Status statusUser = null;
        String descriptions;
        String name;
        System.out.println("Введите название обновленной задачи: ");
        name = scanner.next();

        System.out.println("Введите описание обновленной задачи: ");
        descriptions = scanner.next();

        System.out.println("Введите статус обновленной задачи:");
        System.out.println("1 - NEW" +
                " 2 - IN_PROGRESS" +
                " 3 - DONE");
        int choseUse = scanner.nextInt();

        int temp = 1;
        if (userTypeTask == 1) {
            System.out.println("Выберете id задачи для обновления: ");
            int userChooseTask = scanner.nextInt();

            if (manager.getTask(userChooseTask) != null){
                if (name == null){
                    name = manager.getTask(userChooseTask).getName();
                } else if (descriptions == null) {
                    descriptions = manager.getTask(userChooseTask).getDescriptions();
                }
                statusUser = manager.getTask(userChooseTask).getStatus();
            } else  {
                System.out.println("Такой задачи нету");
            }

            if (choseUse == 1) {
                statusUser = Status.NEW;
                Task task1 = new Task(name, descriptions, statusUser);
                manager.createTask(task1);
                System.out.println("Задача обновлена: " + task1);

            } else if (choseUse == 2) {
                statusUser = Status.IN_PROGRESS;
                Task task2 = new Task(name, descriptions, statusUser);
                manager.createTask(task2);
                System.out.println("Задача обновлена: " + task2);

            } else if (choseUse == 3) {
                statusUser = Status.DONE;
                Task task3 = new Task(name, descriptions, statusUser);
                manager.createTask(task3);
                System.out.println("Задача обновлена: " + task3);

            } else {
                System.out.println("Такого статуса нету!");
            }
        } else if (userTypeTask == 2) {
            HashMap<Integer, String> idEpics = new HashMap<>();
            System.out.println("Выберете Epic для обновления: ");
            int userChooseTask = scanner.nextInt();
            for (Epic epic : manager.allEpics()) {
                System.out.print(temp + ".-");
                System.out.println(epic.getName());
                idEpics.put(epic.getId(), epic.getName());
                temp++;

            }
            if (manager.getEpic(userChooseTask) != null){
                if (name == null){
                    name = manager.getEpic(userChooseTask).getName();
                } else if (descriptions == null) {
                    descriptions = manager.getEpic(userChooseTask).getDescriptions();
                }
                statusUser = manager.getEpic(userChooseTask).getStatus();
            }

            if (choseUse == 1) {
                statusUser = Status.NEW;
                Epic epic = new Epic(name, descriptions, statusUser);
                manager.createEpic(epic);
                System.out.println("Задача обновлена: " + epic);

            } else if (choseUse == 2) {
                statusUser = Status.IN_PROGRESS;
                Epic epic = new Epic(name, descriptions, statusUser);
                manager.createEpic(epic);
                System.out.println("Задача обновлена: " + epic);

            } else if (choseUse == 3) {
                statusUser = Status.DONE;
                Epic epic = new Epic(name, descriptions, statusUser);
                manager.createEpic(epic);
                System.out.println("Задача обновлена: " + epic);

            } else {
                System.out.println("Такого статуса нету!");
            }
        } else if (userTypeTask == 3) {
            HashMap<Integer, String> idSubtasks = new HashMap<>();
            System.out.println("Выберете Subtask для обновления: ");
            int userChooseTask = scanner.nextInt();
            int epicId = 0;
            for (Subtask subtask : manager.allSubtasks()) {
                System.out.print(temp + ".-");
                System.out.println(subtask.getName());
                idSubtasks.put(subtask.getId(), subtask.getName());
                temp++;
                epicId = subtask.getEpicId();

            }

            if (manager.getEpic(userChooseTask) != null){
                if (name == null){
                    name = manager.getSubtask(userChooseTask).getName();
                } else if (descriptions == null) {
                    descriptions = manager.getSubtask(userChooseTask).getDescriptions();
                }
                statusUser = manager.getEpic(userChooseTask).getStatus();
            }

            if (choseUse == 1) {
                statusUser = Status.NEW;
                Subtask subtask = new Subtask(name, descriptions, statusUser, epicId);
                manager.createSubtask(subtask);
                System.out.println("Задача обновлена: " + subtask);

            } else if (choseUse == 2) {
                statusUser = Status.IN_PROGRESS;
                Subtask subtask = new Subtask(name, descriptions, statusUser, epicId);
                manager.createSubtask(subtask);
                System.out.println("Задача обновлена: " + subtask);

            } else if (choseUse == 3) {
                statusUser = Status.DONE;
                Subtask subtask = new Subtask(name, descriptions, statusUser, epicId);
                manager.createSubtask(subtask);
                System.out.println("Задача обновлена: " + subtask);

            } else {
                System.out.println("Такого статуса нету!");
            }
        } else {
            System.out.println("Такого типа задач нету! ");
        }
    }

    public static void clearListTasks(Scanner scanner, InMemoryTaskManager manager) {
        System.out.println("Выберете какой список задач удалить: ");
        printListChoose();
        System.out.println("4-Все");

        int userComm = scanner.nextInt();
        switch (userComm){
            case 4:
            case 1:
                manager.deleteAllTasks();
                System.out.println("Все задачи Task были удалены");
                break;
            case 2:
                manager.deleteAllEpics();
                System.out.println("Все задачи Epic были удалены");
                break;
            case 3:
                manager.deleteAllSubtasks();
                System.out.println("Все задачи Subtask были удалены");
                break;
        }
    }

    public static void printListTasks(Scanner scanner, InMemoryTaskManager manager) {
        System.out.println("Выберете какой список задач вывести: ");
        printListChoose();
        System.out.println("4-Все");

        int userComm = scanner.nextInt();
        switch (userComm){
            case 4:
            case 1:
                System.out.println("Tasks: " + manager.allTasks());
                break;
            case 2:
                System.out.println("Epics: " + manager.allEpics());
                break;
            case 3:
                System.out.println("subtasks: " + manager.allSubtasks());
                break;
        }

    }

}