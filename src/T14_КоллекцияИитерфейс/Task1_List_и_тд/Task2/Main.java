package T14_КоллекцияИитерфейс.Task1_List_и_тд.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final HandMadeArrayList<Person> arr = new HandMadeArrayList<>();

        arr.add(new Person("John"));
        arr.add(new Person("Sam"));

        Person[] people = arr.getElements();

        for (int i = 0; i <arr.getSize(); i++) {
            Person people1 = people[i];
            System.out.println(people1.getName());
            people1.sleep();
        }
    }
}
