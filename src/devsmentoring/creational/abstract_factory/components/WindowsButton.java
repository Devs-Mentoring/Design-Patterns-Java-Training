package devsmentoring.creational.abstract_factory.components;

import devsmentoring.creational.abstract_factory.components.abstraction.WindowsComponent;

public class WindowsButton extends WindowsComponent {
    public WindowsButton(String systemVersion) {
        super(systemVersion);
    }

    @Override
    public void update() {
        System.out.println("Updating a Windows button!");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Windows Button!");
    }
}
