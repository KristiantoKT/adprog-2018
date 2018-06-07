package id.ac.ui.cs.advprog.tutorial2.exercise1;

import id.ac.ui.cs.advprog.tutorial2.exercise1.command.CeilingFanCommand;
import id.ac.ui.cs.advprog.tutorial2.exercise1.command.CeilingFanHighCommand;
import id.ac.ui.cs.advprog.tutorial2.exercise1.command.CeilingFanMediumCommand;
import id.ac.ui.cs.advprog.tutorial2.exercise1.command.CeilingFanOffCommand;
import id.ac.ui.cs.advprog.tutorial2.exercise1.command.LightOffCommand;
import id.ac.ui.cs.advprog.tutorial2.exercise1.command.LightOnCommand;
import id.ac.ui.cs.advprog.tutorial2.exercise1.invoker.RemoteControlWithUndo;
import id.ac.ui.cs.advprog.tutorial2.exercise1.receiver.CeilingFan;
import id.ac.ui.cs.advprog.tutorial2.exercise1.receiver.Light;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Light light = new Light("Kitchen");

        CeilingFanCommand ceilingFanMedium =
                new CeilingFanMediumCommand(ceilingFan);
        CeilingFanCommand ceilingFanHigh =
                new CeilingFanHighCommand(ceilingFan);
        CeilingFanCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(2, lightOn, lightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
