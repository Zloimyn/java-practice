package T20_Unixtime.Task2;

import java.time.Instant;

public class Pizza {
    public static void main(String[] args) {
        long sec = 180;

        Instant instant = Instant.now();
        System.out.println("Сейчас: " + instant);
        Instant future = instant.plusSeconds(sec);
        System.out.println("Через " + sec + "- секунд будет " + future + " и пицца готова");
    }
}
