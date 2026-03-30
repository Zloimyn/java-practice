package T17_Исключения_and_more.Task1;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        System.out.println(parseStringToURI("https://google.com"));
        System.out.println(parseStringToURI("\\\\"));
        System.out.println(parseStringToURI(null));
    }

    public static URI parseStringToURI(final String input) {
        try {
            return new URI(input);
        }catch (URISyntaxException | NullPointerException e){ // Здесь пишем ошибки которые могут произойти
            return null;
        }
    }
}
