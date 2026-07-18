package T23_Jsonjiik.Zadachka1;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.util.Random;

import java.io.IOException;
import java.io.OutputStream;

public class DaysHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        Random random = new Random();
        System.out.println("Началась обработка /day запроса от клиента.");

        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int randomInt = random.nextInt(days.length);
        String randomDay = days[randomInt];

        httpExchange.sendResponseHeaders(200, 0);

        try (OutputStream os = httpExchange.getResponseBody()) {
            os.write(randomDay.getBytes());
        }
    }
}
