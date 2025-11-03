package behavioral.mediator.exemplo01.classes;

import behavioral.mediator.exemplo01.interfaces.ServidorChat;

public class UsuarioConcreto extends Usuario {

    public UsuarioConcreto(ServidorChat mediador, String nome) {
        super(mediador, nome);
    }

    // o usuário envia a mensagem para o Mediador
    @Override
    public void enviar(String mensagem) {
        System.out.println(nome + " enviando: " + mensagem);
        // delega o trabalho de distribuição da mensagem ao Mediador
        mediador.enviarMensagem(mensagem, this);
    }

    // o usuáiro recebe a mensagem do Mediador
    @Override
    public void receber(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }

}
