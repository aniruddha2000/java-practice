package ControlBox;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        LightsOnCommand livingRoomLightOn = new LightsOnCommand(livingRoomLight);
        LightsOffCommand livingRoomLightOff = new LightsOffCommand(livingRoomLight);

        LightsOnCommand kitchenLightOn = new LightsOnCommand(kitchenLight);
        LightsOffCommand kitchenLightOff = new LightsOffCommand(kitchenLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }
}
