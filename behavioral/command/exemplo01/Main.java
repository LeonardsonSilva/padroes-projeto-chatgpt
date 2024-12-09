package command;

import command.classes.Fan;
import command.classes.FanOnCommand;
import command.classes.Light;
import command.classes.LightOffCommand;
import command.classes.LightOnCommand;
import command.classes.RemoteControl;
import command.interfaces.Command;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(ceilingFan);

        RemoteControl remote = new RemoteControl();

        remote.executeCommand(lightOn);
        remote.executeCommand(fanOn);
        remote.executeCommand(lightOff);

        System.out.println("\nDesfazendo o último comando:");
        remote.undoLastCommand();
        remote.undoLastCommand();
    }
}
