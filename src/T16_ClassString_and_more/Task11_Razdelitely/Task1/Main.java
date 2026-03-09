package T16_ClassString_and_more.Task11_Razdelitely.Task1;

public class Main {
    public static void main(String[] args) {
        String dollarAssets = "Акции$Облигации$Фонды$";

        String[] split = dollarAssets.split("\\$"); // разбейте строку dollarAssets

        System.out.println(split[0].equals("Акции"));
        System.out.println(split[1].equals("Облигации"));
        System.out.println(split[2].equals("Фонды"));
    }
}
