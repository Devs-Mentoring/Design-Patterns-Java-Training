package devsmentoring.behavioural.strategy.context;

import devsmentoring.behavioural.strategy.strategies.PackStrategy;

public abstract class Packager {
    PackStrategy packStrategy;

    Packager(PackStrategy packStrategy) {
        this.packStrategy = packStrategy;
    }

    abstract public void pack(Item itemToPack);

    public PackStrategy getPackStrategy() {
        return packStrategy;
    }

    public void setPackStrategy(PackStrategy packStrategy) {
        this.packStrategy = packStrategy;
    }
}
