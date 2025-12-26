package B_V2_TaskTrecker;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHistoryManager implements HistoryManager{
    private ArrayList<Task> history = new ArrayList<>();


    public void add(Task task){
           if (history.size() >= 10){
               history.add(task);
               history.removeLast();
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
