package T14_КоллекцияИитерфейс.Task1_List_и_тд.Task2;

public class Person {
    private final String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Обедает в кафе.");
    }

    public void sleep() {
        System.out.println("Крепко спит всю ночь.");
    }
}
