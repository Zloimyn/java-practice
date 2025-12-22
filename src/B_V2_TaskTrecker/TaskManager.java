package B_V2_TaskTrecker;

import java.util.ArrayList;
import java.util.List;

public interface TaskManager {

    void createTask(Task task);
    void createEpic(Epic epic);
    void createSubtask(Subtask subtask);


    void updateTask(Task task);
    void updateEpic(Epic epicUpdate, Epic epicOld);
    void updateSubtask(Subtask updatedSubtask);

    ArrayList<Task> allTasks();
    ArrayList<Epic> allEpics();
    ArrayList<Subtask> allSubtasks();
    ArrayList<Task> getTask(int userId);
//    ArrayList<Epic> getEpic();
//    ArrayList<Subtask> getsubtask();


    void deleteIdTask(int deleteId);
    void deleteIdEpic(int deleteId);
    void deleteAllTask();
    void deleteAllEpic();
    void updateEpicStatus(int epicId);

    // Служебные методы:::
    List<Task> getDefaultHistory();

}
