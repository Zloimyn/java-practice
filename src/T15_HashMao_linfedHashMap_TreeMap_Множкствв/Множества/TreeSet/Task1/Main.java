package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Множества.TreeSet.Task1;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ItemComparator itemComparator = new ItemComparator();
        Set<Ticket> tickets = new TreeSet<>(itemComparator);
        fillTickets(tickets);

        System.out.println("Доступные билеты: ");
        for (Ticket ticket : tickets) {
            System.out.println("  * " + ticket);
        }
    }

    private static void fillTickets(Set<Ticket> tickets) {
        tickets.add(new Ticket("Лондон", "Париж", 376));
        tickets.add(new Ticket("Милан", "Стамбул", 298));
        tickets.add(new Ticket("Берлин", "Бостон", 1273));
        tickets.add(new Ticket("Пекин", "Рим", 846));
        tickets.add(new Ticket("Санкт-Петербург", "Афины", 284));
        tickets.add(new Ticket("Сидней", "Токио", 1738));
        tickets.add(new Ticket("Мюнхен", "Дубай", 974));
    }
}
