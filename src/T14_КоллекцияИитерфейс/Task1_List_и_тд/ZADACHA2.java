package T14_КоллекцияИитерфейс.Task1_List_и_тд;

import java.util.Arrays;
import java.util.List;

public class ZADACHA2 {
    public static void main(String[] args) {
        final String[] coffeeArray = {"Латте","Капучино","Эспрессо"};

        for (String i : coffeeArray){
            System.out.println(i + ", ");
        }
        System.out.println();

        final List<String> coffeList1 = Arrays.asList(coffeeArray);
        final List<String> coffeList2 = List.of(coffeeArray);
        System.out.println(coffeList1);
        System.out.println(coffeList2);
    }
}

