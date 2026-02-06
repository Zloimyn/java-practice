package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Task8;

import java.util.HashMap;

public class Pipi {
    private static HashMap<User,Long> users = new HashMap<>();

    public static void main(String[] args) {
        // создадим 1 миллион пользователей
        for (long i = 1; i <= 10_000_000L; i++) {
            users.put(new User(i, "i"), i);
        }

        final long startTime = System.nanoTime();
        Long user = findUser(378_366L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");
    }

    private static Long findUser(Long userId) {
        User user = new User(userId,"123");
        return users.get(user);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        User user = (User) o;
        return ((User) o).id == user.id;
    }

    @Override
    public int hashCode(){
        return users.hashCode();
    }
}