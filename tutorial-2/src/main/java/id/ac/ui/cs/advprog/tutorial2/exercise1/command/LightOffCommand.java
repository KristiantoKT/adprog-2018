package id.ac.ui.cs.advprog.tutorial2.exercise1.command;

import id.ac.ui.cs.advprog.tutorial2.exercise1.receiver.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
