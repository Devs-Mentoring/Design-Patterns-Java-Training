package devsmentoring;


import devsmentoring.structural.adapter.communication.HTTPClient;
import devsmentoring.structural.adapter.communication.adapter.ClientAdapter;
import devsmentoring.structural.adapter.communication.adapter.HTTPClientAdapter;
import devsmentoring.structural.adapter.communication.HTTPServer;
import devsmentoring.structural.adapter.communication.abstraction.Server;

public class Main {
    public static void main(String[] args) {
        HTTPClient httpClient = new HTTPClient();
        ClientAdapter httpClientAdapter = new HTTPClientAdapter(httpClient);
        Server httpServer = new HTTPServer(httpClientAdapter);

        httpServer.send("Hello World!");
    }
}