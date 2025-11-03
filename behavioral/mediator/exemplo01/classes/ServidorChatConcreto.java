package behavioral.mediator.exemplo01.classes;

import java.util.ArrayList;
import java.util.List;

import behavioral.mediator.exemplo01.interfaces.ServidorChat;


// ConcreteMediator
// centraliza toda a lógica de interação (quem recebe a mensagem).
public class ServidorChatConcreto implements ServidorChat {
    private List<Usuario> usuarios;

    public ServidorChatConcreto() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    // lógica principal: o mediador decide como a mensagem será distribuída.
    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {
        // itera sobre todos os usuárioe envia a mensagem,
        // exceto para o próprio remetente (lógica centralizada aqui).
        for (Usuario u : this.usuarios) {
            if (u != remetente) {
                u.receber("Mensagem de " + remetente.getNome() + ": " + mensagem);
            }
        }
    }

}
