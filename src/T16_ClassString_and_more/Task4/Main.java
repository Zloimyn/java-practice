package T16_ClassString_and_more.Task4;


public class Main {
    public static void main(String[] args) {
        String name1 = "faesa other ashdasdvhasvdhs";
        String name2 = "faesa other adda";
        String name3 = "faesa";
        String name4 = "other faesa";
        String other = "other";
        System.out.println(startWith(name1,other));
        System.out.println(endsWith(name1,other));
    }
    public static boolean startWith(String initial, String other){
        if (initial.indexOf(other) == -1){
            return false;
        }
        return initial.indexOf(other) == 0;
    }

    public static boolean endsWith(String initial, String other){
        if (initial.indexOf(other) == -1){
            return false;
        }
        int newLenght = initial.length() - other.length();
        return initial.lastIndexOf(other) == newLenght;
    }
}
