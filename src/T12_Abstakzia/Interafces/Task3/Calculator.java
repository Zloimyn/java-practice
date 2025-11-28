package T12_Abstakzia.Interafces.Task3;

import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        double timeTotal = 0.0;
        double timeSeries = 0.0;
        double timeMovie = 0.0;

        for (MediaItem mediaI : mediaItems) {
            if (mediaI instanceof Series){
                timeSeries += ((Series) mediaI).getSeriesCount() * mediaI.getRuntime();
            }else if (mediaI instanceof Movie){
                timeMovie += mediaI.getRuntime();
            }
        }
        timeTotal += timeSeries + timeMovie;
        timeTotal /=1440;
        return timeTotal;
    }

}