package T16_ClassString_and_more.Task11_Razdelitely.Task2;

public class Main {
    public static void main(String[] args) {
        String[] rainbow = new String[]{
                "Красный",
                "Оранжевый",
                "Жёлтый",
                "Зелёный",
                "Голубой",
                "Синий",
                "Фиолетовый"
        };

        String join = String.join("," , rainbow);

//        StringBuilder sbRainbow = new StringBuilder();
//        for (int i = 0; i < rainbow.length; i++) {
//            sbRainbow.append(rainbow[i]);
//            if (i != rainbow.length - 1) {
//                sbRainbow.append(", ");
//            }
//        }

        System.out.println(join);
    }
}
