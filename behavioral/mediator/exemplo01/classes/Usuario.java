package behavioral.mediator.exemplo01.classes;

import behavioral.mediator.exemplo01.interfaces.ServidorChat;

public abstract class Usuario {
    protected ServidorChat mediador;
    protected String nome;

    public Usuario(ServidorChat mediador, String nome) {
        this.mediador = mediador;
        this.nome = nome;
    }

    public abstract void enviar(String mensagem);  // implemetação do envio
    public abstract void receber(String mensagem);  // implementação do recebimento
    public String getNome() { return nome; }
}
