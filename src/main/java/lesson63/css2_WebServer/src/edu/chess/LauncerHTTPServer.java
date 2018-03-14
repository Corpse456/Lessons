package lesson63.css2_WebServer.src.edu.chess;

import lesson63.css2_WebServer.src.edu.chess.http_server.SimpleHttpServer;

public class LauncerHTTPServer {

    public static void main (String[] args) {
        new SimpleHttpServer().launch();
    }
}
