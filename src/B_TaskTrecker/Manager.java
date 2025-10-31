package B_TaskTrecker;

import java.util.HashMap;
import java.util.Scanner;

public class Manager {
    private int managerId = 1;

    private HashMap<Integer,Task> tasks = new HashMap<>();
    private HashMap<Integer,Subtask> subtasks = new HashMap<>();
    private HashMap<Integer,Epic> epics = new HashMap<>();

    void createTask(Task task){
        task.setId(managerId);
        tasks.put(managerId,task);
        managerId++;
    }

    void createEpic(Epic epic){
        epic.setId(managerId);
        epics.put(managerId,epic);
        managerId++;
    }

    void createSubtask(Subtask subtask){
        subtask.setId(managerId);
        subtasks.put(managerId,subtask);
        managerId++;

        Epic epic = epics.get(subtask.getEpicId());

        updateEpic(subtask.getEpicId());
    }

    void returnTaskId(Task task,int userId){
        for (int i = 0; i < userId; i++) {
            if (userId == task.getId()){
                System.out.println("Задача с индефикатором  "+ userId + ": " + tasks.get(userId));
            }
        }
    }

    void returnEpicID(Epic epic,int userId){
        for (int i = 0; i < userId; i++) {
            if (epic.getId() == userId){
                System.out.println("Задача с индефикатором "+ userId + " "+ epics.get(userId));
            }
        }
    }

    void updateTask(Task task){
        tasks.put(task.getId(), task);
    }

    void updateEpic(Epic epic){
        epics.put(epic.getId(), epic);
    }

    void allTasks(){
        System.out.println("Список всех задач: ");
        for (int i = 1; i < managerId; i++) {
            System.out.println(tasks.get(i));
        }
    }

    void allEpics(){
        System.out.println("Список всех задач: ");
        for (int i = 1; i < managerId; i++) {
            System.out.println(epics.get(i));
        }
    }


    void deleteIdTask(int deleteId){
        if (managerId < deleteId){
            System.out.println("Такой задачи не существует");
        }else {
            System.out.println("Задача была удалена: ");
            System.out.println(tasks.get(deleteId));
            tasks.remove(deleteId);
        }
    }

    void deleteIdEpic(int deleteId){
        if (managerId < deleteId){
            System.out.println("Такой задачи не существует");
        }else {
            System.out.println("Задача была удалена: ");
            System.out.println(epics.get(deleteId));
            epics.remove(deleteId);
        }
    }

    void deleteAllTask(){
        System.out.println("Все задачи были удалены: ");
        tasks.clear();
    }

    void deleteAllEpic() {
        System.out.println("Все задачи были удалены: ");
        epics.clear();
    }

    void updateEpicStatus(int epicId){

    }


}
