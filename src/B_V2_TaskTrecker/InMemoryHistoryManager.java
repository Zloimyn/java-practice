package B_V2_TaskTrecker;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHistoryManager implements HistoryManager{
    private ArrayList<Task> history = new ArrayList<>();


    public void add(Task task){
        for (int i = 0; i < history.size(); i++) {
            if (history.get(i) != null){
                if (history.size() > 10){
                }
            }
        }
    }

    public List<Task> getHistory() {
        return history;
    }
}
