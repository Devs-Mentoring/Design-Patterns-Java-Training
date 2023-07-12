package devsmentoring.structural.facade.controllers;

import devsmentoring.structural.facade.components.doors.Door;
import devsmentoring.structural.facade.components.doors.GarageDoor;
import devsmentoring.structural.facade.components.doors.MainDoor;
import devsmentoring.structural.facade.components.light.HallLight;
import devsmentoring.structural.facade.components.light.Light;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl extends Controller {
    Light hallLight;
    Map<String, Door> doors = new HashMap<>();

    public RemoteControl() {
        this.hallLight = new HallLight("Bulb");
        doors.put("main_door", new MainDoor("Huge Door"));
        doors.put("garage_door", new GarageDoor("Blue Door"));
    }

    @Override
    public void close() {
        for (Door door : this.doors.values()) {
            door.close();
        }
    }

    @Override
    public void open() {
        for (Door door : this.doors.values()) {
            door.open();
        }
    }

    @Override
    public void light() {
        if (!this.hallLight.getIsOn()) {
            this.hallLight.lightOn();
        } else {
            System.out.println("The light can't be lit!");
        }
    }

    @Override
    public void switchOff() {
        if (this.hallLight.getIsOn()) {
            this.hallLight.switchOff();
        } else {
            System.out.println("The light can't ben switched off!");
        }
    }
}
