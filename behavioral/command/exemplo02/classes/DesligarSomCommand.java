package behavioral.command.exemplo02.classes;

import behavioral.command.exemplo02.interfaces.Command;

// Classe ConcreteCommand (comando concreto) - Desligar
public class DesligarSomCommand implements Command {
    // o Receiver (AparelhoDeSom) é injetado no construtor
    private AparelhoDeSom som;

    public DesligarSomCommand(AparelhoDeSom som) {
        this.som = som;
    }

    @Override
    // a implementação do Command: chama o método do Receiver
    public void execute() {
        som.desligar();
    }

}
