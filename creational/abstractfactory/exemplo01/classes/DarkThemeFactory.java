package creational.abstractfactory.exemplo01.classes;

import creational.abstractfactory.exemplo01.interfaces.Botao;
import creational.abstractfactory.exemplo01.interfaces.ComponenteFactory;
import creational.abstractfactory.exemplo01.interfaces.Janela;


// Fábrica Concreta
public class DarkThemeFactory implements ComponenteFactory {

    @Override
    public Botao criarBotao() {
        return new BotaoEscuro();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaEscura();
    }

}
