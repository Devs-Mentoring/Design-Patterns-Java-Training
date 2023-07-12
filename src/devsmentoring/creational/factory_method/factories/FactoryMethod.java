package devsmentoring.creational.factory_method.factories;

import devsmentoring.creational.factory_method.messages.HardwareMessage;
import devsmentoring.creational.factory_method.messages.Message;
import devsmentoring.creational.factory_method.messages.SoftwareMessage;

public class FactoryMethod {
    public static Message produce(ErrorCodes errorCode){
        return switch(errorCode){
            case HARDWARE_ERROR -> new HardwareMessage();
            case SOTWARE_ERROR -> new SoftwareMessage();
            default -> throw new IllegalArgumentException("Invalid message type!");
        };
    }
}
