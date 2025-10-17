package T11_MoreInformations.Task1;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );
        Forest forest = new Forest();

        System.out.println("В лесу лето!");
        Forest.setSeason("Summer");
        // создайте объект "летний лес с зайцами"

        System.out.println("Список зайцев:");
        forest.printHares(hares);

        System.out.println("В лесу зима!");
        Forest.setSeason("Winter");
        // поменяйте время года на зиму

        System.out.println("Список зайцев:");
        forest.printHares(hares);
    }
}

