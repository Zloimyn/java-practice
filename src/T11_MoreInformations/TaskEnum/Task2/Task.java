package T11_MoreInformations.TaskEnum.Task2;

public class Task {
    TaskPriority taskPriority; // добавьте переменную priority с приоритетом задачи
    private String description;

    public Task(TaskPriority taskPriority, String description) {
        this.description = description;
        this.taskPriority = taskPriority;
    }

    // добавьте конструктор класса
    // добавьте метод get для приоритета

    public TaskPriority getPriority() {
        return taskPriority;
    }

    public String getDescription() {
        return description;
    }


}
