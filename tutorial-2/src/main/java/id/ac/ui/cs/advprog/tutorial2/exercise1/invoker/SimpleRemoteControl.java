package id.ac.ui.cs.advprog.tutorial2.exercise1.invoker;

import id.ac.ui.cs.advprog.tutorial2.exercise1.command.Command;

public class SimpleRemoteControl {

    private Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
