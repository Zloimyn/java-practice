package B_TaskTrecker;

import java.util.ArrayList;
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
        if (epic != null){
            epic.addSubtaskid(subtask.getId());
        }

        updateEpicStatus(subtask.getEpicId());
    }



    void updateTask(Task taskUpdate, Task taskOld){
        tasks.put(taskOld.getId(), taskUpdate);
    }

    void updateEpic(Epic epicUpdate,Epic epicOld){
        epics.put(epicOld.getId(), epicUpdate);
    }

    void updateSubtask(Subtask updatedSubtask){
        int id = updatedSubtask.getId();

        if (subtasks.containsKey(id)) {
            subtasks.put(id, updatedSubtask);
            updateEpicStatus(updatedSubtask.getEpicId());
        }
    }

    ArrayList<Task> allTasks(){
        ArrayList<Task> result = new ArrayList<>();
        for (int i = 1; i < managerId; i++) {
            if (tasks.get(i) != null){
                result.add(tasks.get(i));
            }
        }
        return result;
    }

    ArrayList<Epic> allEpics(){
        ArrayList<Epic> result = new ArrayList<>();
        for (int i = 1; i < managerId; i++) {
            if (epics.get(i) != null){
                result.add(epics.get(i));
            }
        }
        return result;
    }

    ArrayList<Subtask> allSubtasks(){
        ArrayList<Subtask> result = new ArrayList<>();
        for (int i = 0; i < managerId; i++) {
            if (subtasks.get(i) != null){
                result.add(subtasks.get(i));
            }
        }
        return result;
    }


    void deleteIdTask(int deleteId){
        if (managerId != deleteId){
            System.out.println("Такой задачи не существует");
        }else {
            System.out.println("Задача была удалена: ");
            System.out.println(tasks.get(deleteId));
            tasks.remove(deleteId);
        }
    }

    void deleteIdEpic(int deleteId){
        if (managerId != deleteId){
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
        Epic epic = epics.get(epicId);
        ArrayList<Integer> subIds = epic.getSubtaskId();
        if (subIds.isEmpty()) {
//            epic.setStatus(Status.NEW);
            return;
        }

        boolean allNew = true;
        boolean allDone = true;

        for (int subId : subIds) {
            Subtask sub = subtasks.get(subId);

            if (sub.getStatus() != Status.NEW) {
                allNew = false;
            }
            if (sub.getStatus() != Status.DONE) {
                allDone = false;
            }
        }
        if (allNew) {
//            Epic epic1 = new Epic(epic.getName(),epic.getDescriptions(),Status.NEW);
        } else if (allDone) {
//            epic.setStatus(Status.DONE);
        } else {
//            epic.setStatus(Status.IN_PROGRESS);
        }
    }


}
