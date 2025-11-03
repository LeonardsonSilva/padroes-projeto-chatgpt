package behavioral.mediator.exemplo01;

import behavioral.mediator.exemplo01.classes.ServidorChatConcreto;
import behavioral.mediator.exemplo01.classes.Usuario;
import behavioral.mediator.exemplo01.classes.UsuarioConcreto;
import behavioral.mediator.exemplo01.interfaces.ServidorChat;

public class Main {
    public static void main(String[] args) {
        ServidorChat servidor = new ServidorChatConcreto();

        // cria os componentes (os usuários), passando o Mediador
        Usuario joao = new UsuarioConcreto(servidor, "João");
        Usuario maria = new UsuarioConcreto(servidor, "Maria");
        Usuario pedro = new UsuarioConcreto(servidor, "Pedro");

        // adiciona os componentes ao Mediador
        servidor.adicionarUsuario(joao);
        servidor.adicionarUsuario(maria);
        servidor.adicionarUsuario(pedro);

        System.out.println("--- Início do Chat ---");

        joao.enviar("Olá a todos! Como vocês estão?");
        System.out.println("\n--- Próxima Mensagem ---");
        maria.enviar("Estou bem, João! E você, Pedro?");

    }
}
