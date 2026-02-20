package B_V2_TaskTrecker;

import java.util.ArrayList;
import java.util.List;

public interface TaskManager {

    void createTask(Task task);
    void createEpic(Epic epic);
    void createSubtask(Subtask subtask);


    void updateTask(Task task);
    void updateEpic(Epic epicUpdate);
    void updateSubtask(Subtask updatedSubtask);

    ArrayList<Task> allTasks();
    ArrayList<Epic> allEpics();
    ArrayList<Subtask> allSubtasks();
    ArrayList<Task> getTask(int userId);
    ArrayList<Epic> getEpic(int userId);
    ArrayList<Subtask> getSubtask(int userId);

    int getSize();

    List<Task> getHistory();
    void add(Task task);
    void remove(int id);
    void removeNode(Node node);
//    Node linkedLast(Task task);

    void deleteIdTask(int deleteId);
    void deleteIdEpic(int deleteId);
    void deleteIdSubtask(int deleteId);
    void deleteAllTask();
    void deleteAllEpic();
    void deleteAllSubtask();
    void updateEpicStatus(int epicId);

    // Служебные методы:::
    List<Task> getDefaultHistory();

}
