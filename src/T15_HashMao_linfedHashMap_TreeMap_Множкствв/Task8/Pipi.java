package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Task8;

import java.util.HashMap;

public class Pipi {
    private static HashMap<User,Long> users = new HashMap<>();

    public static void main(String[] args) {
        // создадим 1 миллион пользователей
        for (long i = 1; i <= 1000000L; i++) {
            users.put(new User(i, "Имя" + i), i);
//            System.out.println(new User(i, "Имя" + i));
        }

        final long startTime = System.nanoTime();
        Long user = findUser(5L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");

//        User user1 = new User(1L, "1");
//        User user2 = new User(1L, "1");
//
//        System.out.println(user1.equals(user2));


    }

    private static Long findUser(Long userId) {
        User user = new User(userId,"Имя" + userId);
        System.out.println(user);
        return users.get(user);
    }

}