package B_TaskTrecker;


public class Subtask extends Task {
    private Epic epicId;
    public Subtask(String name, String descriptions, Status status,Epic epicId) {
        super(name, descriptions, status);
        this.epicId = epicId;
    }

    Epic getEpicId(){
        return epicId;
    }

}
