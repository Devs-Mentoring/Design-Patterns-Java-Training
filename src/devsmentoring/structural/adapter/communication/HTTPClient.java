package devsmentoring.structural.adapter.communication;

import devsmentoring.structural.adapter.communication.abstraction.Client;

public class HTTPClient extends Client {
    public void get(String data) {
        System.out.println("Received data: " + data);
    }
}
