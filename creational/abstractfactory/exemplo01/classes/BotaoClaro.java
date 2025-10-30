package creational.abstractfactory.exemplo01.classes;

import creational.abstractfactory.exemplo01.interfaces.Botao;

public class BotaoClaro implements Botao {
    @Override
    public void desenhar() {
        System.out.println("-> Desenhando Botão Claro (Fundo Branco)");
    }
}
