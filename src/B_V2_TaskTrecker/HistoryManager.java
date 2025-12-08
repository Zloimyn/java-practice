package B_V2_TaskTrecker;

import java.util.List;

public interface HistoryManager {

     void add(Task task);
     List<Task> getHistory();
}
