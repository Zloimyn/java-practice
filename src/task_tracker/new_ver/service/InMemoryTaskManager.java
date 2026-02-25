package task_tracker.new_ver.service;

import task_tracker.new_ver.model.Epic;
import task_tracker.new_ver.model.Status;
import task_tracker.new_ver.model.Subtask;
import task_tracker.new_ver.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryTaskManager implements TaskManager {
    private int taskId = 1;
    InMemoryHistoryManager historyManager = new InMemoryHistoryManager();

    private final HashMap<Integer, Task> tasks = new HashMap<>();
    private final HashMap<Integer, Subtask> subtasks = new HashMap<>();
    private final HashMap<Integer, Epic> epics = new HashMap<>();

    public void createTask(Task task){
        task.setId(taskId);
        tasks.put(taskId,task);
        taskId++;
    }

    public void createEpic(Epic epic){
        epic.setId(taskId);
        epics.put(taskId,epic);
        taskId++;
    }

    public void createSubtask(Subtask subtask){
        Epic epic = epics.get(subtask.getEpicId());
        if (epic != null){
            subtask.setId(taskId);
            subtasks.put(taskId,subtask);

            epic.addSubtaskId(subtask.getId());
            updateEpicStatus(subtask.getEpicId());

            taskId++;
        }

    }


    public void updateTask(Task updatedTask){
        int id = updatedTask.getId();
        if (tasks.containsKey(id)){
            tasks.put(id,updatedTask);
        }
    }

    public void updateEpic(Epic updatedEpic){
        int id = updatedEpic.getId();
        if (epics.containsKey(id)) {
            epics.put(id, updatedEpic);
            updateEpicStatus(id);
        }
    }

    public void updateSubtask(Subtask updatedSubtask){
        int id = updatedSubtask.getId();
        if (subtasks.containsKey(id)) {
            subtasks.put(id, updatedSubtask);
            updateEpicStatus(id);
        }
    }


    public List<Task> allTasks(){
        ArrayList<Task> result = new ArrayList<>();
        for (int i = 1; i < taskId; i++) {
            if (tasks.get(i) != null){
                result.add(tasks.get(i));
            }
        }
        return result;
    }

    public List<Subtask> allSubtasks(){
        ArrayList<Subtask> result = new ArrayList<>();
        for (int i = 1; i < taskId; i++) {
            if (subtasks.get(i) != null){
                result.add(subtasks.get(i));
            }
        }
        return result;
    }

    public List<Epic> allEpics(){
        ArrayList<Epic> result = new ArrayList<>();
        for (int i = 1; i < taskId; i++) {
            if (epics.get(i) != null){
                result.add(epics.get(i));
            }
        }
        return result;
    }

    public Task getTask(int userId){
        return tasks.get(userId);
    }

    public Subtask getSubtask(int userId){
        return subtasks.get(userId);
    }

    public Epic getEpic(int userId){
        return epics.get(userId);
    }

    public void deleteTask(int deleteId){
        if (taskId != deleteId){
            System.out.println("Такой задачи не существует");
        }else {
            System.out.println("Задача была удалена: ");
            System.out.println(tasks.get(deleteId));
            tasks.remove(deleteId);
        }
    }

    public void deleteEpic(int deleteId){
        if (taskId != deleteId){
            System.out.println("Такой задачи не существует");
        }else {
            System.out.println("Задача была удалена: ");
            System.out.println(epics.get(deleteId));
            epics.remove(deleteId);
        }
    }

    public void deleteSubtask(int deleteId){
        if (taskId != deleteId){
            System.out.println("Такой задачи не существует");
        }else {
            System.out.println("Задача была удалена: ");
            System.out.println(subtasks.get(deleteId));
            subtasks.remove(deleteId);
        }
    }

    public void deleteAllTasks(){
        System.out.println("Все задачи были удалены: ");
        tasks.clear();
    }

    public void deleteAllEpics() {
        System.out.println("Все задачи были удалены: ");
        epics.clear();
    }

    public void deleteAllSubtasks(){
        System.out.println("Все задачи были удалены: ");
        subtasks.clear();
    }

    public void updateEpicStatus(int epicId){
        Epic epicNew = epics.get(epicId);
        if (epicNew == null){
            return;
        }

        ArrayList<Integer> subIds = epicNew.getSubtaskIds();
        if (subIds.isEmpty()) {
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

        Status newStatus;
        if (allNew) {
            newStatus = Status.NEW;
        } else if (allDone) {
            newStatus = Status.DONE;
        } else {
            newStatus = Status.IN_PROGRESS;
        }
        Epic updateEpic = new Epic(epicNew.getName(),epicNew.getDescriptions(),newStatus);
        updateEpic.setId(epicNew.getId());
        updateEpic.getSubtaskIds().addAll(subIds);

        epics.put(epicId,updateEpic);
    }

    public List<Task> getDefaultHistory(){
        return  historyManager.getHistory();
    }

    public int getSize(){
        return taskId;
    }

}
