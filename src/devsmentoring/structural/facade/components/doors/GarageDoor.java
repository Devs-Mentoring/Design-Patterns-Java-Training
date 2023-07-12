package devsmentoring.structural.facade.components.doors;

public class GarageDoor extends Door {
    public GarageDoor(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println(this.name + "'s been opened in the garage!");
    }

    @Override
    public void close() {
        System.out.println(this.name + "'s been opened in the garage!");
    }
}
