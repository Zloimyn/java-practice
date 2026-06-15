package T20_Unixtime.Task2;

import java.time.Instant;

public class Task {
    public static void main(String[] args) {
        long millis = 9_000_000_000L; // количество миллисекунд
        Instant doInstant = Instant.ofEpochMilli(millis);
        Instant instantAfter = Instant.ofEpochMilli(-millis);

        System.out.println(doInstant + "- дата millis миллисекунд после Unix-эпохи"); // дата millis миллисекунд после Unix-эпохи
        System.out.println(instantAfter + "- дата millis миллисекунд до Unix-эпохи "); // дата millis миллисекунд до Unix-эпохи
    }
}
