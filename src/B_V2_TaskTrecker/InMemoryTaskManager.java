package B_V2_TaskTrecker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryTaskManager implements TaskManager {
    private int managerId = 1;
    InMemoryHistoryManager historyManager = new InMemoryHistoryManager();

    private HashMap<Integer, Task> tasks = new HashMap<>();
    private HashMap<Integer, Subtask> subtasks = new HashMap<>();
    private HashMap<Integer, Epic> epics = new HashMap<>();

    public void createTask(Task task){
        task.setId(managerId);
        tasks.put(managerId,task);
        managerId++;
    }

    public void createEpic(Epic epic){
        epic.setId(managerId);
        epics.put(managerId,epic);
        managerId++;
    }

    public void createSubtask(Subtask subtask){
        subtask.setId(managerId);
        subtasks.put(managerId,subtask);
        managerId++;

        Epic epic = epics.get(subtask.getEpicId());
        if (epic != null){
            epic.addSubtaskId(subtask.getId());
        }

        updateEpicStatus(subtask.getEpicId());
    }


    public void updateTask(Task task){
        tasks.put(task.getId(),task);
    }

    public void updateEpic(Epic epicUpdate){
        int id = epicUpdate.getId();

        if (epics.containsKey(id)) {
            epics.put(id, epicUpdate);
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

    public ArrayList<Task> allTasks(){
        ArrayList<Task> result = new ArrayList<>();
        for (int i = 1; i < managerId; i++) {
            if (tasks.get(i) != null){
                result.add(tasks.get(i));
            }
        }
        return result;
    }

    public ArrayList<Subtask> allSubtasks(){
        ArrayList<Subtask> result = new ArrayList<>();
        for (int i = 1; i < managerId; i++) {
            if (subtasks.get(i) != null){
                result.add(subtasks.get(i));
            }
        }
        return result;
    }

    public ArrayList<Epic> allEpics(){
        ArrayList<Epic> result = new ArrayList<>();
        for (int i = 1; i < managerId; i++) {
            if (epics.get(i) != null){
                result.add(epics.get(i));
            }
        }
        return result;
    }

    public ArrayList<Task> getTask(int userId){
        ArrayList<Task> result = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(userId) != null){
                result.add(tasks.get(userId));
                historyManager.add(tasks.get(userId));
                return result;
            }else {
            }
        }
        return result;
    }

    public ArrayList<Subtask> getSubtask(int userId){
        ArrayList<Subtask> result = new ArrayList<>();
        for (int i = 0; i < subtasks.size(); i++) {
            if (subtasks.get(userId) != null){
                result.add(subtasks.get(userId));
                historyManager.add(subtasks.get(userId));
                return result;
            }else {
            }
        }
        return result;
    }

    public ArrayList<Epic> getEpic(int userId){
        ArrayList<Epic> result = new ArrayList<>();
        for (int i = 0; i < epics.size(); i++) {
            if (epics.get(userId) != null){
                result.add(epics.get(userId));
                historyManager.add(epics.get(userId));
                return result;
            }else {
            }
        }
        return result;
    }

    public void deleteIdTask(int deleteId){
        if (managerId != deleteId){
            System.out.println("Такой задачи не существует");
        }else {
            System.out.println("Задача была удалена: ");
            System.out.println(tasks.get(deleteId));
            tasks.remove(deleteId);
        }
    }

    public void deleteIdEpic(int deleteId){
        if (managerId != deleteId){
            System.out.println("Такой задачи не существует");
        }else {
            System.out.println("Задача была удалена: ");
            System.out.println(epics.get(deleteId));
            epics.remove(deleteId);
        }
    }

    public void deleteIdSubtask(int deleteId){
        if (managerId != deleteId){
            System.out.println("Такой задачи не существует");
        }else {
            System.out.println("Задача была удалена: ");
            System.out.println(subtasks.get(deleteId));
            subtasks.remove(deleteId);
        }
    }

    public void deleteAllTask(){
        System.out.println("Все задачи были удалены: ");
        tasks.clear();
    }

    public void deleteAllEpic() {
        System.out.println("Все задачи были удалены: ");
        epics.clear();
    }

    public void deleteAllSubtask(){
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
        return managerId;
    }

}
