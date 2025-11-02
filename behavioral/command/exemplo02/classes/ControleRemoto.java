package behavioral.command.exemplo02.classes;

import behavioral.command.exemplo02.interfaces.Command;

// classe Invoker (O Invocador)
// o objeto que invoca (pede) a execução de um comando.
// Ele só conhece a Interface Command, e não os comandos concretos ou o Receiver.
public class ControleRemoto {
    // o comando que o botão deve executar
    private Command slot;

    // método para configurar qual comando será executado (parâmetro)
    public void setCommand(Command command) {
        this.slot = command;
    }

    // método para "pressionar o botão" (invocar o comando)
    public void apertarBotao() {
        // o invocador apenas chama o execute(). Não sabe O QUÊ está sendo executado.
        if (slot != null) {
            slot.execute();
        }
    }
}
