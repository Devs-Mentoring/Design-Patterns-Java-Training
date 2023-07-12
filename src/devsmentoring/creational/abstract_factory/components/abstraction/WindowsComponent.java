package devsmentoring.creational.abstract_factory.components.abstraction;

import java.awt.*;

public abstract class WindowsComponent implements Component {
    String systemVersion;

    public WindowsComponent(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public abstract void update();
}
