package B_TaskTrecker;

import java.util.HashMap;

public class Task {
    private int id;
    private String name;
    private String descriptions;
    private Status status;

    Task(String name,String descriptions,Status status){
        this.descriptions = descriptions;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (this.id != 0){
            this.id = id;
        }
    }

    public String getDescriptions() {
        return descriptions;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

}
