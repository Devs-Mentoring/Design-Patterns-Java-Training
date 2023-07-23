package devsmentoring.behavioural.strategy.context;

import devsmentoring.behavioural.strategy.strategies.PackStrategy;

public class BoxPackager extends Packager {

    public BoxPackager(PackStrategy packStrategy) {
        super(packStrategy);
    }

    @Override
    public void pack(Item itemToPack) {
        this.packStrategy.pack(itemToPack);
        itemToPack.setPacked(true);
    }
}
