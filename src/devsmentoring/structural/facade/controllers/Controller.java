package devsmentoring.structural.facade.controllers;

public abstract class Controller {
    public abstract void close();

    public abstract void open();

    public abstract void light();

    public abstract void switchOff();
}
