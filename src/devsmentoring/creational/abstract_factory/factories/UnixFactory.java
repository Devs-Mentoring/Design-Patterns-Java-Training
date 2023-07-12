package devsmentoring.creational.abstract_factory.factories;

import devsmentoring.creational.abstract_factory.components.UnixButton;
import devsmentoring.creational.abstract_factory.components.UnixNavbar;
import devsmentoring.creational.abstract_factory.components.abstraction.UnixComponent;

public class UnixFactory extends GUIFactory {
    public UnixComponent produceButton() {
        return new UnixButton();
    }

    public UnixComponent produceNavbar() {
        return new UnixNavbar();
    }
}
