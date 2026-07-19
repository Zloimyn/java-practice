package T23_Jsonjiik.Zadachka5;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PostsHandler implements HttpHandler {
    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;
    private static Gson gson = new Gson();
    private static List<Post> posts = new ArrayList<>();

    static {
        Post post1 = new Post(1, "Это первый пост, который я здесь написал.");
        post1.addComment(new Comment("Пётр Первый", "Я успел откомментировать первым!"));
        posts.add(post1);

        Post post2 = new Post(22, "Это будет второй пост. Тоже короткий.");
        posts.add(post2);

        Post post3 = new Post(333, "Это пока последний пост.");
        posts.add(post3);
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        Endpoint endpoint = getEndpoint(exchange.getRequestURI().getPath(), exchange.getRequestMethod());

        switch (endpoint) {
            case GET_POSTS: {
                handleGetPosts(exchange);
                break;
            }
            case GET_COMMENTS: {
                handleGetComments(exchange);
                break;
            }
            case POST_COMMENT: {
                handlePostComments(exchange);
                break;
            }
            default:
                writeResponse(exchange, "Такого эндпоинта не существует", 404);
        }
    }

    private Endpoint getEndpoint(String requestPath, String requestMethod) {
        String[] pathParts = requestPath.split("/");

        if (pathParts.length == 2 && pathParts[1].equals("posts")) {
            return Endpoint.GET_POSTS;
        }
        if (pathParts.length == 4 && pathParts[1].equals("posts") && pathParts[3].equals("comments")) {
            if (requestMethod.equals("GET")) {
                return Endpoint.GET_COMMENTS;
            }
            if (requestMethod.equals("POST")) {
                return Endpoint.POST_COMMENT;
            }
        }
        return Endpoint.UNKNOWN;
    }

    private void handleGetPosts(HttpExchange exchange) throws IOException {
        // верните JSON, представляющий список постов. Код ответа должен быть 200.
        writeResponse(exchange, gson.toJson(posts), 200);
    }

    private void handleGetComments(HttpExchange exchange) throws IOException {
        Optional<Integer> postIdOpt = getPostId(exchange);

            /* Верните комментарии к указанному посту. Код ответа должен быть 200.
            Если запрос был составлен неверно, верните сообщение об ошибке. */
        try {
            if (postIdOpt.isEmpty()){
                writeResponse(exchange,"Некорректный идентификатор поста",400);
            }else {
                Post post = null;
                for (int i = 0; i < posts.size(); i++) {
                    if (postIdOpt.get() == posts.get(i).getId()){
                        post = posts.get(i);
                    }
                }
                if (post == null){
                    writeResponse(exchange, "Пост с идентификатором: " + postIdOpt.get() + " не найден",404);
                }else {
                    writeResponse(exchange, gson.toJson(post.getCommentaries()),200);
                }
            }
        } catch (NumberFormatException e){
            System.out.println(e);
        }
    }

    private Optional<Integer> getPostId(HttpExchange exchange) {
            /* Реализуйте метод получения идентификатора поста.
            Если идентификатор не является числом, верните Optional.empty(). */
        String path = exchange.getRequestURI().getPath();
        String[] pathParts = path.split("/");
        try {
            return Optional.of(Integer.valueOf(pathParts[2]));
        }catch (NumberFormatException e){
            return Optional.empty();
        }
    }

    private void handlePostComments(HttpExchange exchange) throws IOException {
        writeResponse(exchange, "Этот эндпоинт пока не реализован", 200);
    }

    private void writeResponse(HttpExchange exchange,
                               String responseString,
                               int responseCode) throws IOException {
        if (responseString.isBlank()) {
            exchange.sendResponseHeaders(responseCode, 0);
        } else {
            byte[] bytes = responseString.getBytes(DEFAULT_CHARSET);
            exchange.sendResponseHeaders(responseCode, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
        }
        exchange.close();
    }
}
