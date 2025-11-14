package B_TaskTrecker;
import java.util.ArrayList;

public class Epic extends Task {
    private ArrayList<Integer> subtaskIds = new ArrayList<>();

    public Epic(String name, String descriptions) {
        super(name, descriptions, Status.NEW);
    }

    public ArrayList<Integer> getSubtaskIds() {
        return subtaskIds;
    }

    void addSubtaskId(int subtaskId){
        subtaskIds.add(subtaskId);
    }

}
