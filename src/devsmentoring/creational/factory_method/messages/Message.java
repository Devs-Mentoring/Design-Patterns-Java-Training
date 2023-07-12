package devsmentoring.creational.factory_method.messages;

public abstract class Message {
    static int counter = 0;
    int id;

    Message(){
        this.id = Message.counter;
        Message.counter += 1;
    }

    public abstract void show();
}
