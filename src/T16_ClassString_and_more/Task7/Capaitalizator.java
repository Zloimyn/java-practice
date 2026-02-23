package T16_ClassString_and_more.Task7;

import java.util.Locale;

public class Capaitalizator {
    public static void main(String[] args) {
        Capaitalizator check = new Capaitalizator();
        System.out.println(capitalize("я не волшебник"));
    }

    public static String capitalize(String str){
        return str.toLowerCase(Locale.ROOT);
    }
}
