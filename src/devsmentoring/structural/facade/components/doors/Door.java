package devsmentoring.structural.facade.components.doors;

public abstract class Door {
    protected String name;

    public Door(String name) {
        this.name = name;
    }

    public abstract void open();

    public abstract void close();
}
