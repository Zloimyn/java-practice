package B_V3_TaskTrecker.model;

import java.util.ArrayList;

public class Epic extends Task {

    private ArrayList<Integer> subtaskIds = new ArrayList<>();

    public Epic(String name, String descriptions) {
        super(name, descriptions);
    }

    public Epic(String name, String descriptions, Status status) {
        super(name, descriptions, status);
    }

    public ArrayList<Integer> getSubtaskIds() {
        return subtaskIds;
    }

    public void addSubtaskId(int subtaskId){
        subtaskIds.add(subtaskId);
    }

    public String toString(){
        return super.toString() + ". Id subtask: " + subtaskIds;
    }

}
