package T23_Jsonjiik.Zadachka4;

import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;

public class Practice {
    private static final int PORT = 7777;

    public static void main(String[] args) throws IOException {

        // добавьте код для конфигурирования и запуска сервера
        HttpServer httpServer = HttpServer.create();
        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/posts", new PostsHandler());
        httpServer.start();

        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
    }
}
