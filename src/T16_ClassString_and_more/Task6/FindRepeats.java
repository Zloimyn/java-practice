package T16_ClassString_and_more.Task6;

public class FindRepeats {
    public static void main(String[] args) {
        FindRepeats check = new FindRepeats();
        int count = check.numberOfRepeats("раз, aasfakjsfkjaf , раз", "раз");
        System.out.println(count);
    }

    public static int numberOfRepeats(String text, String substring) {
        int count = 0;
        int lenght = 0;
        lenght = text.indexOf(substring);
        while (lenght != -1){
            count++;
            lenght += text.indexOf(substring, lenght + substring.length());
        }
        return count;
    }
}

