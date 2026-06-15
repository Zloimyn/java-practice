package T20_Unixtime.Task2;

import java.time.Instant;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int chickenUnixSecond = new Random().nextInt(1000000000);
        Instant chickenMoment = Instant.ofEpochSecond(chickenUnixSecond);

        int eggUnixSecond = new Random().nextInt(1000000000);
        Instant eggMoment = Instant.ofEpochSecond(eggUnixSecond);

        System.out.println("Курица появилась в " + chickenMoment);
        System.out.println("Яйцо появилось в " + eggMoment);

        if (chickenMoment.isBefore(eggMoment)) {
            System.out.println("Первой была курица!");
        }
        if (chickenMoment.isAfter(eggMoment)) {
            System.out.println("Первым было яйцо!");
        }
        if (chickenMoment.equals(eggMoment)) {
            System.out.println("Яйцо было одновременно с курицей  ̄\\_(ツ)_/ ̄)!");
        }

    }
}
