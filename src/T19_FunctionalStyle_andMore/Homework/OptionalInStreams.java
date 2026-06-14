package T19_FunctionalStyle_andMore.Homework;

import java.util.stream.Stream;
public class OptionalInStreams {
    public static void main(String[] args) {
        System.out.println(Stream.of(1, 2, 3, 4, 5)
                .filter(number -> number % 2 == 0)
                .map(String::valueOf)
                //выбрать первый отфильтрованный элемент
                .findFirst()
                //вывести на экран найденное число либо строку "Чётное число не найдено"
                .orElse("Четное число не найдено"));
    }
}
