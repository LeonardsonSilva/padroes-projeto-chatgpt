package creational.abstractfactory.exemplo01.classes;

import creational.abstractfactory.exemplo01.interfaces.Botao;
import creational.abstractfactory.exemplo01.interfaces.ComponenteFactory;
import creational.abstractfactory.exemplo01.interfaces.Janela;


// Fábrica Concreta
public class LightThemeFactory implements ComponenteFactory {

    @Override
    public Botao criarBotao() {
        return new BotaoClaro();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaClara();
    }

}
