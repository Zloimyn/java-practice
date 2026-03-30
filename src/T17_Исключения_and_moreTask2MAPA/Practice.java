package T17_Исключения_and_moreTask2MAPA;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Practice {
    public static void main(String[] args) {
        System.out.println(addToMap(new HashMap<>(), "test", "test"));
        System.out.println(addToMap(new HashMap<>(), null, null));

        System.out.println(addToMap(new TreeMap<>(), "test", "test"));
        System.out.println(addToMap(new TreeMap<>(), null, null));

        System.out.println(addToMap(Map.of(), "test", "test"));
    }

    public static Map<String, Object> addToMap(final Map<String, Object> storage,
                                               final String key, final Object value) {
        storage.put(key, value);
        return storage;
    }
}
