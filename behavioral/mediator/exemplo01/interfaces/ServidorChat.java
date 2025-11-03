package behavioral.mediator.exemplo01.interfaces;

import behavioral.mediator.exemplo01.classes.Usuario;

public interface ServidorChat {
    void enviarMensagem(String mensagem, Usuario remetente);
    void adicionarUsuario(Usuario usuario);
}
