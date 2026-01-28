package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Homewok2;

import java.util.HashMap;
import java.util.Map;

public class Maiami {
    // Создадим хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения — количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();
    int zakas = 1;

    public static void main(String[] args) {
        Maiami pizzeria = new Maiami();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        if (orders.containsKey(clientName)){
            orders.put(clientName, orders.get(clientName) + 1);
        }else {
            orders.put(clientName,zakas);
        }
        // Сохраните новый заказ в хеш-таблицу. При обновлении счётчика заказов
        // не забудьте учесть заказы, которые уже были сделаны ранее.
    }

    private void printStatistics() {
        int min = 0;
        int max = 0;
        int allZakas = 0;
        for (int i = 0; i < orders.size(); i++) {
            allZakas += orders.get(i);
            if (orders.get(i) > max){
                max = orders.get(i);
            } else if (orders.get(i) < min) {
                min = orders.get(i);
            }
        }
        System.out.println("Всего заказов: " + allZakas);
        System.out.println("Заказов от: "  + " ");
        // Выведите собранную статистику в консоль и посчитайте общее количество заказов.
        //
        // Формат для вывода данных в консоль:
        //     Заказов от Микеланджело: 15
        //     Заказов от Леонардо: 4
        //     Всего заказов: 19
    }
}
