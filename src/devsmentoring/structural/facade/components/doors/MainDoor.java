package devsmentoring.structural.facade.components.doors;

public class MainDoor extends Door {
    public MainDoor(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println(this.name + "'s been opened in the main hall!");
    }

    @Override
    public void close() {
        System.out.println(this.name + "'s been opened in the main hall!");
    }
}
