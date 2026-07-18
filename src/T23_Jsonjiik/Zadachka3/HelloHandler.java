package T23_Jsonjiik.Zadachka3;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String response = "";

        // извлеките метод из запроса
        String method = httpExchange.getRequestMethod();

        switch (method){
            // сформируйте ответ в случае, если был вызван POST-метод
            case "POST":
                // извлеките path из запроса
                String path = httpExchange.getRequestURI().getPath();
                // а из path — профессию и имя
                String[] splitStrings = path.split("/");
                String profession = splitStrings[2];
                String name = splitStrings[3];

                String goodDay = "Доброе Утро";

                // извлеките заголовок
                Headers requestHeaders = httpExchange.getRequestHeaders();
                List<String> wishGoodDay = requestHeaders.get("X-Wish-Good-Day");

                if ((wishGoodDay != null) && (wishGoodDay.contains("true"))) {
                    response = goodDay + ", " + profession + " " + name + " Хорошего дня";
                } else {
                    response = goodDay + ", " + profession + " " + name;
                }

                // не забудьте про ответ для остальных методов
                break;
            case "GET":
                response = "Здравствуйте!";
                break;
            default:
                response = "Некорректный метод!";
                break;
        }

        httpExchange.sendResponseHeaders(200, 0);
        try (OutputStream os = httpExchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}
