package devsmentoring.behavioural.strategy.context;

public abstract class Item {
    String name;
    double price;
    boolean isPacked = false;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPacked() {
        return isPacked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPacked(boolean packed) {
        isPacked = packed;
    }
}
