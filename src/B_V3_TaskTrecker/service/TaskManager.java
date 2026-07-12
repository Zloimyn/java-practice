package B_V3_TaskTrecker.service;

import B_V3_TaskTrecker.model.Epic;
import B_V3_TaskTrecker.model.Subtask;
import B_V3_TaskTrecker.model.Task;

import java.util.List;

public interface TaskManager {

    void createTask(Task task);
    void createEpic(Epic epic);
    void createSubtask(Subtask subtask);

    void updateTask(Task task);
    void updateEpic(Epic epicUpdate);
    void updateSubtask(Subtask updatedSubtask);

    List<Task> allTasks();
    List<Epic> allEpics();
    List<Subtask> allSubtasks();

    Task getTask(int userId);
    Epic getEpic(int userId);
    Subtask getSubtask(int userId);

    int getSize();

    void deleteTask(int deleteId);
    void deleteEpic(int deleteId);
    void deleteSubtask(int deleteId);

    void deleteAllTasks();
    void deleteAllEpics();
    void deleteAllSubtasks();

    void updateEpicStatus(int epicId);

    // Служебные методы:::
    List<Task> getDefaultHistory();

}
