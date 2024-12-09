package behavioral.command.exemplo01.classes;

import java.util.Stack;

import behavioral.command.exemplo01.interfaces.Command;

public class RemoteControl {
    private final Stack<Command> commandHistory = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nenhum commando para desfazer.");
        }
    }
}
