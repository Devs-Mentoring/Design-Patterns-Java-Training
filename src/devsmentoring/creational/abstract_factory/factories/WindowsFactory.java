package devsmentoring.creational.abstract_factory.factories;

import devsmentoring.creational.abstract_factory.components.WindowsButton;
import devsmentoring.creational.abstract_factory.components.abstraction.WindowsComponent;

public class WindowsFactory {
    public WindowsComponent produceButton(String systemVersion) {
        return new WindowsButton(systemVersion);
    }

    public WindowsComponent produceNavbar(String systemVersion) {
        return new WindowsButton(systemVersion);
    }
}
