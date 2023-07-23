package devsmentoring.behavioural.observer.items;

import devsmentoring.behavioural.observer.observers.Observer;

public abstract class Item {
    protected int id;
    protected double price;
    protected boolean isAvailable;

    protected Item(int id, double price, boolean isAvailable) {
        this.id = id;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public abstract void register(Observer observer);

    public abstract void unregister(Observer observer);

    public abstract void notifySubscribers();

    public int getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean available) {
        if (!this.isAvailable) {
            this.notifySubscribers();
        }
        this.isAvailable = available;
    }
}