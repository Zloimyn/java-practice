package task_tracker.new_ver.model;

public class Task {
    private int id;
    private String name;
    private String descriptions;
    protected Status status;

    public Task(String name, String descriptions) {
        this.descriptions = descriptions;
        this.name = name;
        this.status = Status.NEW;
    }

    public Task(String name, String descriptions, Status status) {
        this.descriptions = descriptions;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (this.id == 0) {
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

    @Override
    public String toString() {
        return "Имя: " + this.name + ". Описание: " + this.descriptions + ". Статус: " + this.status + ". Id: " + this.id;
    }

}