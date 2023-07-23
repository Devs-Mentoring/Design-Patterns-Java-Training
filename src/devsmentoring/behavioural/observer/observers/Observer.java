package devsmentoring.behavioural.observer.observers;

import devsmentoring.behavioural.observer.items.Item;

public abstract class Observer {
    protected String name;

    Observer(String name) {
        this.name = name;
    }

    public abstract void update(Item item);
}
