package devsmentoring.creational.abstract_factory.components;

import devsmentoring.creational.abstract_factory.components.abstraction.UnixComponent;

public class UnixNavbar extends UnixComponent {
    @Override
    public void showPenguinLogo() {
        System.out.println("Showing navbar with penguin logo!");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Unix Navbar!");
    }
}
