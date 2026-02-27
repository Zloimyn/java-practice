package T16_ClassString_and_more.Task9;

public class Main {
    public static void main(String[] args) {
        String text = "    история каждой из крупных галактических цевилизаций может быть разделена на три различные, " +
                "ярко выраженные фазы: Борьба за выживание, Любопытство и Утонченность, также именуемые фазами " +
                "„Как?“, „Зачем?“ и „Где?“. Пример: если для первой фазы характерен вопрос: „Как бы нам поесть?“," +
                " а для второй „Зачем мы едим?“, то третья отличается вопросом: „Где бы нам лучше поужинать?“.   ";

        var textFixer = new Main();
        var fixedText = textFixer.fixText(text);
        System.out.println(fixedText);
    }
    public String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public String fixText(String text) {
        return capitalize(text).trim().replaceAll("„","«").replaceAll("“","»").replaceAll("цевилизаций","цивилизаций");
    }
}
