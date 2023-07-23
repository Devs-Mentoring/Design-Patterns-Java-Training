package devsmentoring.behavioural.strategy.strategies;

import devsmentoring.behavioural.strategy.context.Item;

public class OvalPackStrategy implements PackStrategy {
    @Override
    public void pack(Item item) {
        System.out.println("Packing item: " + item.getName() + " with the oval strategy!");
    }
}
