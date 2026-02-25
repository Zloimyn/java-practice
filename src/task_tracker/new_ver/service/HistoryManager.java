package task_tracker.new_ver.service;

import task_tracker.new_ver.model.Task;

import java.util.List;

public interface HistoryManager {

     void add(Task task);
     List<Task> getHistory();
}
