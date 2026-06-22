package T20_Unixtime.Zadachka;

import java.time.Duration;
import java.time.LocalDateTime;

public class Task3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }

        LocalDateTime korozePosleFor = LocalDateTime.now();
        Duration sravnenue = Duration.between(localDateTime, korozePosleFor);

        System.out.println("Короче до: " + localDateTime.getNano()  + ". После: " + korozePosleFor.getNano() + " сек" + " Сравнение: " + sravnenue.toNanos());
    }
}
