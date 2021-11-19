package ControlBox;

public class LightsOnCommand implements Command {
    Light light;

    LightsOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
