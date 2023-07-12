package devsmentoring.structural.facade.components.light;

public class HallLight extends Light {
    public HallLight(String name) {
        super(name);
    }

    @Override
    public void lightOn() {
        System.out.println(this.name + "'s been lit in the hall!");
        this.isOn = true;
    }

    @Override
    public void switchOff() {
        System.out.println(this.name + "'s been switched off in the hall!");
        this.isOn = false;
    }
}
