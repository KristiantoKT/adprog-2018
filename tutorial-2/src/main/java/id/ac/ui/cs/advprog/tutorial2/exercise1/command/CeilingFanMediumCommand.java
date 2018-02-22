package id.ac.ui.cs.advprog.tutorial2.exercise1.command;

import id.ac.ui.cs.advprog.tutorial2.exercise1.receiver.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    protected void operate() {
        ceilingFan.medium();
    }
}
