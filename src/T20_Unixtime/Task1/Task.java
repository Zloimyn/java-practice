package T20_Unixtime.Task1;

import java.time.Instant;

public class Task {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        long mili = instant.toEpochMilli();
        System.out.println(mili);

        Instant instant1 = Instant.ofEpochSecond(-386310686L);
        System.out.println(instant1 + "- Время запуска заданное в секундах");

        System.out.println(timeConvertor(90_000));
    }

    static String timeConvertor (int sec){
        int day = sec / 86400;
        int temp = sec % 86400;

        int hour = temp / 3600;
        temp = temp % 3600;

        int min = temp / 60;
        int seC = temp % 60;

        return  day + " day: " + hour + " chas: " + min + " min: " + seC + " seci:";
    }
}
