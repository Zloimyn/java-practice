package T11_MoreInformations.Task1;
import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static String season;

    // объявите недостающие переменные и добавьте конструктор
     static void setSeason(String newSeason){
        Forest.season = newSeason;
        if (season.equals("Winter")){
            MountainHare.setColor("белой");
            System.out.println("Шуба стала "+MountainHare.getColor());
        }else {
            MountainHare.setColor("серо-рыжая");
            System.out.println("Шуба стала "+MountainHare.getColor());
        }
     }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    void printHares(List<MountainHare> hares){
        for (MountainHare hare : hares){
            System.out.println(hare);
        }
    }
    // добавьте метод printHares()
}
