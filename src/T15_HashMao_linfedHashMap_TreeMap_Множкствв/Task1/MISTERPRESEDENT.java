package T15_HashMao_linfedHashMap_TreeMap_Множкствв.Task1;

import java.util.HashMap;
import java.util.Scanner;

public class MISTERPRESEDENT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> skolikoGolosov = new HashMap<>();

        String name = scanner.next();
        skolikoGolosov.put(name,0);

        for (int i = 0; i < 5; i++) {
            int golosa = scanner.nextInt();
            skolikoGolosov.put(name, skolikoGolosov.get(name) + golosa);
        }

        System.out.println(skolikoGolosov);
    }
}
