package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Task3;
import java.util.HashMap;
import java.util.Map;

public class Mine {
    public static void main(String[] args) {
        // ключ — название задачи, значение — выполнена эта задача или ещё нет
        Map<String, Boolean> todos = new HashMap<>();

        todos.put("Выучить Java", true);
        todos.put("Найти классную работу", false);
        todos.clear(); // дополните код, чтобы очистить список задач

        // дополните кодом, который даст верный ответ
        System.out.println("Todo-список пуст? Ответ: " + todos.isEmpty());
    }
}
