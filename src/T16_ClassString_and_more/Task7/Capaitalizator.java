package T16_ClassString_and_more.Task7;

public class Capaitalizator {
    public static void main(String[] args) {
        Capaitalizator check = new Capaitalizator();
        System.out.println(capitalize("я не волшебник"));
    }

    public static String capitalize(String str){
        String ia = str.substring(0,1).toUpperCase();
        return ia + str.substring(1);
    }
}
