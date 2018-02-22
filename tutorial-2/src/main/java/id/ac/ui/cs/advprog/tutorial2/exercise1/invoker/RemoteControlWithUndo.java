package id.ac.ui.cs.advprog.tutorial2.exercise1.invoker;

import id.ac.ui.cs.advprog.tutorial2.exercise1.command.Command;
import id.ac.ui.cs.advprog.tutorial2.exercise1.command.NoCommand;

public class RemoteControlWithUndo {

    public static final int NUM_OF_BUTTONS = 7;
    private static final String STR_FMT = "[slot %d] %s    %s\n";

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[NUM_OF_BUTTONS];
        offCommands = new Command[NUM_OF_BUTTONS];
        Command noCmd = new NoCommand();

        for (int i = 0; i < NUM_OF_BUTTONS; i++) {
            setCommand(i, noCmd, noCmd);
        }

        undoCommand = noCmd;
    }

    public void setCommand(int slot, Command onCmd, Command offCmd) {
        onCommands[slot] = onCmd;
        offCommands[slot] = offCmd;
    }

    public void onButtonWasPushed(int slot) {
        // TODO Complete me!
    }

    public void offButtonWasPushed(int slot) {
        // TODO Complete me!
    }

    public void undoButtonWasPushed() {
        // TODO Complete me!
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("\n------ Remote Control ------\n");
        for (int slot = 0; slot < NUM_OF_BUTTONS; slot++) {
            String entry = String.format(STR_FMT, slot,
                    onCommands[slot].getClass().getName(),
                    offCommands[slot].getClass().getName());
            builder.append(entry);
        }
        builder.append("[undo] " + undoCommand.getClass().getName());

        return builder.toString();
    }
}
