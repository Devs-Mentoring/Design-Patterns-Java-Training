package devsmentoring.creational.abstract_factory.components;

import devsmentoring.creational.abstract_factory.components.abstraction.WindowsComponent;

public class WindowsNavbar extends WindowsComponent {
    public WindowsNavbar(String systemVersion) {
        super(systemVersion);
    }

    @Override
    public void update() {
        System.out.println("Updating a Windows navbar!");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Windows Navbar!");
    }
}
