package devsmentoring;


import devsmentoring.behavioural.strategy.context.Item;
import devsmentoring.behavioural.strategy.context.ShopItem;
import devsmentoring.behavioural.strategy.context.BoxPackager;
import devsmentoring.behavioural.strategy.context.Packager;
import devsmentoring.behavioural.strategy.strategies.CubePackStrategy;
import devsmentoring.behavioural.strategy.strategies.OvalPackStrategy;

public class Main {
    public static void main(String[] args) {
        // Created shopItems to pack.
        Item shopItemToPack1 = new ShopItem("ball", 10.0);
        Item shopItemToPack2 = new ShopItem("guitar", 25.0);
        Item shopItemToPack3 = new ShopItem("book", 25.0);
        Item shopItemToPack4 = new ShopItem("apple", 25.0);

        // Created strategies.
        CubePackStrategy cubePackStrategy = new CubePackStrategy();
        OvalPackStrategy ovalPackStrategy = new OvalPackStrategy();

        // Created packager that will be using the strategies.
        Packager boxPackager = new BoxPackager(cubePackStrategy);

        // We pack oval items with oval packing strategy below.
        boxPackager.pack(shopItemToPack2);
        boxPackager.pack(shopItemToPack3);

        // We change strategy from oval to cube one.
        boxPackager.setPackStrategy(ovalPackStrategy);

        // We pack cube-like items with cube strategy.
        boxPackager.pack(shopItemToPack1);
        boxPackager.pack(shopItemToPack4);
    }
}