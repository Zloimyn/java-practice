package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Task6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mami {
    // Пример списка пассажиров (на самом деле их больше)
    private static final List<String> passengerNames = List.of(
            "Аймурат Бериков",
            "Диана Азатова",
            "Азамат Бексултанов",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        // Тут нужно написать код, который будет распределять места в самолёте ✈️
        HashMap<String,Integer> seats = new HashMap<>();
        for (int i = 0; i < passengerNames.size(); i++) {
            seats.put(passengerNames.get(i),i+1);
        }
        return seats;
    }
}
