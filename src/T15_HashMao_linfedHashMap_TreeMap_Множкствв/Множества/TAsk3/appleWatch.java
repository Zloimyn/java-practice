package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Множества.TAsk3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class appleWatch {
    public static void main(String[] args) {
        List<String> songs = new ArrayList<>();
        fillSongs(songs);

        System.out.println("Количество песен: " + songs.size());
        Set<String> allSongsNorepiat = new LinkedHashSet<>(songs);

        System.out.println("Песни:");
        for (String song : allSongsNorepiat) {
            System.out.println("  * " + song);
        }
    }

    private static void fillSongs(List<String> songs) {
        songs.add("Sting – Shape Of My Heart");
        songs.add("Gorillaz – Clint Eastwood");
        songs.add("Lady Gaga – Bad Romance");
        songs.add("Taylor Swift – Wildest Dreams");
        songs.add("Ariana Grande – 7 rings");
        songs.add("Depeche Mode – Personal Jesus");
        songs.add("Gorillaz – Clint Eastwood");
        songs.add("Lady Gaga – Bad Romance");
        songs.add("Bruno Mars – Talking To The Moon");
        songs.add("Taylor Swift – Wildest Dreams");
    }
}
