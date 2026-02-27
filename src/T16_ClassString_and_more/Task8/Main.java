package T16_ClassString_and_more.Task8;

public class Main {
    public static void main(String[] args) {
        String rules = "На зелёный цвет — стой на месте;\n" +
                "на зелёный цвет — приготовься;\n" +
                "на зелёный — осмотрись, а затем смело шагай.";

        String replaced = rules.replaceFirst("зелёный","красный").replaceFirst("зелёный"," желтый");
        System.out.println(replaced);
    }
}
