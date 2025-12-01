package T12_Abstakzia.Djeneriki.Extend_Djeneriki.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Первый магазин продает дорогие товары и хочет передавать цент с типом Long
        List<Long> longList = new ArrayList<>();
        longList.add(Long.MAX_VALUE);

        Printer<Long> longPrinter = new Printer<>(longList);
        longPrinter.print();

        // Второй магазин продает товары подешевле и использует для передачи цент с типом Integer
        List<Integer> intList = new ArrayList<>();
        intList.add(100000);

        Printer<Integer> integerPrinter = new Printer<>(intList);
        integerPrinter.print();

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");

        // Этот вариант должен вызывать ошибку компиляции
        // Printer<String> stringPrinter = new Printer<>(stringList);
        // stringPrinter.print();
    }
}
