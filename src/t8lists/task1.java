package t8lists;

import java.util.ArrayList;
import java.util.Objects;

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> person1 = new ArrayList<>();
        person1.add("java");
        person1.add("python");
        person1.add("react");
        person1.add("c--");

        ArrayList<String> person2 = new ArrayList<>();
        person2.add("react");
        person2.add("c--");
        person2.add("python");
        for (int i = 0; i < person1.size(); i++) {
            for (int j = 0; j < person2.size(); j++) {
                if (person1.get(i).equals(person2.get(j))) {
                    System.out.println(person1.get(i));
                }
            }
        }
    }
}

