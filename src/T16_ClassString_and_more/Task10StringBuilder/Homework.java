package T16_ClassString_and_more.Task10StringBuilder;

public class Homework {
    public static void main(String[] args) {
        String text = " saasdd ww text www";
        String sub = "text";
        System.out.println(numberOfRepeats(text,sub));
    }
    static int numberOfRepeats(String text, String substring){
        StringBuilder stringBuilder = new StringBuilder(text);
        int count = 0;
        while (stringBuilder.indexOf(substring) != -1){
            count++;
            stringBuilder.delete(0, stringBuilder.indexOf(substring) + substring.length());
        }
        return count;
    }
}
