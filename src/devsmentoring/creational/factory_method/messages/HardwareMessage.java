package devsmentoring.creational.factory_method.messages;

public class HardwareMessage extends Message {
    @Override
    public void show() {
        System.out.println("Problem with some internal component, id: " + this.id);
    }
}
