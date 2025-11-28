package T12_Abstakzia.InterafcTask3;

import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        double timeDays = 0.0;
        for (int i = 0; i < mediaItems.size(); i++) {
            timeDays += mediaItems.getFirst().getRuntime();
            timeDays/=1440;
        }
        return timeDays;
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов

    }

}