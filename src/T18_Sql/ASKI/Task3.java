package T18_Sql.ASKI;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Task3 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF8");
        System.out.println(charset.name());

        Charset charset1 = StandardCharsets.US_ASCII;
        System.out.println(charset1);
    }
}
