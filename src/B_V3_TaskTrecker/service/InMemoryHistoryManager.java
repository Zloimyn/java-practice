package B_V3_TaskTrecker.service;

import B_V3_TaskTrecker.model.Task;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHistoryManager implements HistoryManager {
    private ArrayList<Task> history = new ArrayList<>();

    public void add(Task task){
           if (history.size() >= 10){
               history.add(task);
//               history.removeFirst();
               return;
           }
        history.add(task);
    }

    public List<Task> getHistory() {
        return history;
    }

    public int getSize(){
        return history.size();
    }
}
