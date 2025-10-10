package T10_Object.Task1;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[6];
        people[0] = new Person("Томирис");
        people[2] = new Person("Дамир");
        int peopleCount = sizeOf(people);
        System.out.println("В массиве people " + peopleCount + " элемента.");

        String[] names = { "Максим", "Абай", "Тамерлан", "Александр"};
        int namesCount = sizeOf(names);
        System.out.println("В массиве names " + namesCount + " элемента.");

        Integer[] numbers = { 42, 24, 45, 34, 23, 43, 54, 65, 43 };
        int numbersCount = sizeOf(numbers);
        System.out.println("В массиве numbers " + numbersCount + " элемента.");
    }

    public static int sizeOf(Object[] array) { // параметр - массив элементов типа Object)
        int count = 0;
        for (Object o : array) {
            if (o != null){
                count++;
            }
        }
        return count;
    }
}

