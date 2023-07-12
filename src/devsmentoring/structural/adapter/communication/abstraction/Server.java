package devsmentoring.structural.adapter.communication.abstraction;

import devsmentoring.structural.adapter.communication.adapter.ClientAdapter;

public abstract class Server {
    protected ClientAdapter client;

    protected Server(ClientAdapter client) {
        this.client = client;
    }

    public abstract void send(String data);
}
