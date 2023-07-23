package devsmentoring.behavioural.observer.items;

import devsmentoring.behavioural.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ShopItem extends Item {
    private List<Observer> observers;

    public ShopItem(int id, double price, boolean isAvailable) {
        super(id, price, isAvailable);
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        System.out.println("Starting to notify observers from item with id: " + this.id);
        for (Observer observer : this.observers) {
            observer.update(this);
        }
    }
}
