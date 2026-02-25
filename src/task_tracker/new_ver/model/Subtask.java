package task_tracker.new_ver.model;


public class Subtask extends Task {

    private int epicId;

    public Subtask(String name, String descriptions, int epicId) {
        super(name, descriptions);
        this.status = Status.NEW;
        this.epicId = epicId;
    }

    public Subtask(String name, String descriptions, Status status, int epicId) {
        super(name, descriptions, status);
        this.epicId = epicId;
    }

    public int getEpicId(){
        return epicId;
    }

    public String toString(){
        return super.toString() + ". Id epic: " + epicId;
    }

}
