package creational.abstractfactory.exemplo01.classes;

import creational.abstractfactory.exemplo01.interfaces.Botao;
import creational.abstractfactory.exemplo01.interfaces.ComponenteFactory;
import creational.abstractfactory.exemplo01.interfaces.Janela;

public class Aplicacao {
    private Botao botao;
    private Janela janela;

    private ComponenteFactory factory;

    public Aplicacao(ComponenteFactory factory) {
        this.factory = factory;
    }

    public void pintarInterface() {
        botao = this.factory.criarBotao();
        janela = this.factory.criarJanela();

        botao.desenhar();
        janela.exibir();
    }
}
