package devsmentoring.behavioural.observer.observers;

import devsmentoring.behavioural.observer.items.Item;

public class CustomerObserver extends Observer {
    public CustomerObserver(String name) {
        super(name);
    }

    @Override
    public void update(Item item) {
        System.out.println("Hi, " + this.name + ":");
        System.out.println("Product with id: " + item.getId() + " and price: " + item.getPrice() + " is now available!\n");
    }
}
