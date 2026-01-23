package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Task5;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Maiami {
    public static void main(String[] args) {
        Map<User, List<String>> userOrders = new HashMap<>();

        userOrders.put(
                new User(97457, "Джо", "joe@black.com"),
                List.of("1928873467463")
        );
        userOrders.put(
                new User(29575, "Лиз", "liz@black.com"),
                List.of(
                        "9828674982082",
                        "7249804867520"
                )
        );
        userOrders.put(
                new User(57860, "Ая", "aya@black.com"),
                List.of("4758039927678")
        );

        System.out.println("Заказы: " + userOrders);
    }
}
