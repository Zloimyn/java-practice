package T16_ClassString_and_more.Task1;

public class Main {
    public static void main(String[] args) {
        String hello = "    F";
        fixString(hello);
    }
    public static void fixString(String str){
        if (str.isEmpty() || str.isBlank()){
            System.out.println("Вы ничего не написали");
            return;
        }
        String trimedStr = str.trim();
        System.out.println(trimedStr);
    }
}
