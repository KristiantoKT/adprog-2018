package id.ac.ui.cs.advprog.tutorial2.exercise1.command;

import id.ac.ui.cs.advprog.tutorial2.exercise1.receiver.CeilingFan;

public abstract class CeilingFanCommand implements Command {

    protected CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        // TODO Complete me!
    }

    protected abstract void operate();

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            // TODO Complete me!
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            // TODO Complete me!
        }
    }
}
