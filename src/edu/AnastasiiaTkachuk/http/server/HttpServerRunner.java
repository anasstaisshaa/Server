package edu.AnastasiiaTkachuk.http.server;

public class HttpServerRunner {
    public static void main(String[] args) {
        HttpServer httpServer = new HttpServer(8088, 100);
        httpServer.run();
    }
}
