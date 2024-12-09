package behavioral.command.exemplo01;

import behavioral.command.exemplo01.classes.Fan;
import behavioral.command.exemplo01.classes.FanOnCommand;
import behavioral.command.exemplo01.classes.Light;
import behavioral.command.exemplo01.classes.LightOffCommand;
import behavioral.command.exemplo01.classes.LightOnCommand;
import behavioral.command.exemplo01.classes.RemoteControl;
import behavioral.command.exemplo01.interfaces.Command;

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
