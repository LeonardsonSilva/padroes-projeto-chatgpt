package behavioral.command.exemplo01.classes;

import java.util.Stack;

import behavioral.command.exemplo01.interfaces.Command;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command command) {
        history.push(command);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
