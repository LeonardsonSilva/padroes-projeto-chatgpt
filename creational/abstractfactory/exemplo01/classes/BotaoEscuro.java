package creational.abstractfactory.exemplo01.classes;

import creational.abstractfactory.exemplo01.interfaces.Botao;

public class BotaoEscuro implements Botao {
    @Override
    public void desenhar() {
        System.out.println("-> Desenhando Botão Escuro (Fundo Preto)");
    }
}
