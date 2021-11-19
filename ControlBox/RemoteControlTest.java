package ControlBox;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("dinning");
        LightsOnCommand lightOn = new LightsOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        LightsOffCommand lightOff = new LightsOffCommand(light);
        remote.setCommand(lightOff);
        remote.buttonWasPressed();
    }
}
