package T20_Unixtime.Homework2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Practice {
    public static void main(String[] args) {
        String input = "14 часов 09 минут. Месяц: 02, День: 14, Год: 1966."; printCorrectDateTime(input);
    }
    private static void printCorrectDateTime(String input) { DateTimeFormatter inputFormatter = ... // определите входной формат
        LocalDateTime dateTime = ... // сконвертируйте исходную строку в LocalDateTime
        DateTimeFormatter outputFormatter = ... // определите выходной формат
        System.out.println(...); // выведите результат на экран }
    }
