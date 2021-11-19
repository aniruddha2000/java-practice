package ControlBox;

public class LightsOffCommand implements Command {
    Light light;

    LightsOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
