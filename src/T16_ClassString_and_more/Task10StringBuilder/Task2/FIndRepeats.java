package T16_ClassString_and_more.Task10StringBuilder.Task2;

public class FIndRepeats {
    public static void main(String[] args) {
        String name = "Хасбик ало ";
        String substring = "ало";
        System.out.println(numberOfRepeats(name,substring));
    }
    static int numberOfRepeats(String text, String substring){
        StringBuilder stringBuilder = new StringBuilder(text);
        int count = 0;
        while (stringBuilder.indexOf(substring) != -1){
            count++;
            stringBuilder.delete(stringBuilder.indexOf(substring), stringBuilder.indexOf(substring));
        }
        return count;
    }
}
