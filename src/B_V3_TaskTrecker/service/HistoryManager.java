package B_V3_TaskTrecker.service;

import B_V3_TaskTrecker.model.Task;

import java.util.List;

public interface HistoryManager {

     void add(Task task);
     List<Task> getHistory();
}
