package devsmentoring.creational.abstract_factory.components;

import devsmentoring.creational.abstract_factory.components.abstraction.UnixComponent;

public class UnixButton extends UnixComponent {
    @Override
    public void showPenguinLogo() {
        System.out.println("Showing button with penguin logo!");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Unix Button!");
    }
}
