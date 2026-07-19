package T23_Jsonjiik.Zadachka4;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class PostsHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // получите информацию об эндпоинте, к которому был запрос
        Endpoint endpoint = getEndpoint(exchange.getRequestURI().getPath(),exchange.getRequestMethod());

        switch (endpoint) {
            case GET_POSTS: {
                writeResponse(exchange, "Получен запрос на получение постов", 200);
                break;
            }
            case GET_COMMENTS: {
                writeResponse(exchange, "Получен запрос на получение комментариев", 200);
                break;
            }
            case POST_COMMENT: {
                writeResponse(exchange, "Получен запрос на добавление комментария", 200);
                break;
            }
            default:
                writeResponse(exchange, "Такого эндпоинта не существует", 404);
        }
    }

    private Endpoint getEndpoint(String requestPath, String requestMethod) {
        // реализуйте этот метод
        String[] parts = requestPath.split("/");
        if (parts.length == 2 && requestMethod.equals("GET")){
            return Endpoint.GET_POSTS;
        }else if (parts.length == 4 && requestMethod.equals("GET")) {
            return Endpoint.GET_COMMENTS;
        } else if (parts.length == 4 && requestMethod.equals("POST")) {
            return Endpoint.POST_COMMENT;
        } else {
            return Endpoint.UNKNOWN;
        }
    }

    private void writeResponse(HttpExchange exchange,
                               String responseString,
                               int responseCode) throws IOException {
        /* Реализуйте отправку ответа, который содержит responseString в качестве тела ответа
        и responseCode в качестве кода ответа.
        Учтите, что если responseString — пустая строка, то её не нужно передавать в ответе. */
        byte[] bytes = responseString.getBytes(StandardCharsets.UTF_8);
        int lenght = bytes.length;
        if (responseString.isEmpty()){
            lenght = 0;
        }
        exchange.getResponseHeaders().set("Content-Type", "text/plain; charset=utf-8");
        exchange.sendResponseHeaders(responseCode, lenght);
        try(OutputStream outputStream = exchange.getResponseBody()) {
            if (!responseString.isEmpty()){
                outputStream.write(bytes);
            }
        }
        exchange.close();
    }
}
