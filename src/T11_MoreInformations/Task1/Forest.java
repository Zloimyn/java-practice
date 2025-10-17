package T11_MoreInformations.Task1;
import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static String season;
    static String color;

    // объявите недостающие переменные и добавьте конструктор
     static void setSeason(String newSeason){
        Forest.season = newSeason;
        if (season.equals("Winter")){
            color = "белой";
            System.out.println("Шуба стало "+color);
        }else {
            color = "серо-рыжий";
            System.out.println("Шуба "+color);
        }
     }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    void printHares(){
        for (MountainHare hare : hares){
            System.out.println(hare);
        }
    }
    // добавьте метод printHares()
}
