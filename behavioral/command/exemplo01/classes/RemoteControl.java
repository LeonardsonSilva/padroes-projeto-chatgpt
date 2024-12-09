package behavioral.command.exemplo01.classes;

import behavioral.command.exemplo01.interfaces.Command;

public class RemoteControl {
    private CommandHistory history = new CommandHistory();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nenhum comando para desfazer.");
        }
    }
}
