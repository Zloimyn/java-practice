package T17_Исключения_and_more.Throws.Task1;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(convertStringToUrl("https://google.com"));
    }

    public static URL convertStringToUrl(final String input) throws MalformedURLException {
        return new URL(input);
    }
}
