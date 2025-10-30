package creational.abstractfactory.exemplo01.interfaces;


// interface que define o que toda Fábrica de Componentes deve ser capaz de criar
public interface ComponenteFactory {
    Botao criarBotao();
    Janela criarJanela();
}
