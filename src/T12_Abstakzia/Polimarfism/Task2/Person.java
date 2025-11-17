package T12_Abstakzia.Polimarfism.Task2;

public class Person {
    private final String name;

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
