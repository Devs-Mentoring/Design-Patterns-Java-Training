package devsmentoring.structural.adapter.communication;

import devsmentoring.structural.adapter.communication.abstraction.Server;
import devsmentoring.structural.adapter.communication.adapter.ClientAdapter;

public class HTTPServer extends Server {
    public HTTPServer(ClientAdapter client){
        super(client);
    }

    @Override
    public void send(String data) {
        System.out.println("Sending data to client...");
        this.client.receive(data);
    }
}
