package devsmentoring.structural.facade.components.light;

public abstract class Light {
    protected String name;
    protected boolean isOn = false;
    Light(String name){
        this.name = name;
    }
    public boolean getIsOn(){
        return this.isOn;
    }
    public abstract void lightOn();
    public abstract void switchOff();
}
