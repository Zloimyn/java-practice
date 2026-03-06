package T16_ClassString_and_more.Task10StringBuilder.Task3;

public class Main {
    public static void main(String[] args) {
        String name = "казак";
        isPalidromeWord(name);
    }

    public static Boolean isPalidromeWord(String name){
        StringBuilder stringBuilder1 = new StringBuilder(name);
        stringBuilder1.reverse();

        if (stringBuilder1.toString().equals(name)){
            return true;
        }
        return false;
    }
}
