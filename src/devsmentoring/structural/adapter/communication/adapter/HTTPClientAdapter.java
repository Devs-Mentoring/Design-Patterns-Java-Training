package devsmentoring.structural.adapter.communication.adapter;

import devsmentoring.structural.adapter.communication.abstraction.Client;

public class HTTPClientAdapter implements ClientAdapter {
    Client client;

    public HTTPClientAdapter(Client client) {
        this.client = client;
    }

    @Override
    public void receive(String data) {
        this.client.get(data);
    }
}
