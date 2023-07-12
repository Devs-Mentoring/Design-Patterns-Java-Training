package devsmentoring.creational.abstract_factory.factories;

import devsmentoring.creational.abstract_factory.components.abstraction.Component;

public abstract class GUIFactory {
    abstract Component produceButton();
    abstract Component produceNavbar();
}
