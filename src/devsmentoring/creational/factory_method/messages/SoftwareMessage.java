package devsmentoring.creational.factory_method.messages;

public class SoftwareMessage extends Message {
    @Override
    public void show() {
        System.out.println("Problem with OS, id: " + this.id);
    }
}
