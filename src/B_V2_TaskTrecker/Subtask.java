package B_V2_TaskTrecker;


public class Subtask extends Task {
    private int epicId;
    public Subtask(String name, String descriptions, Status status, int epicId) {
        super(name, descriptions, status);
        this.epicId = epicId;
    }

    int getEpicId(){
        return epicId;
    }

}
