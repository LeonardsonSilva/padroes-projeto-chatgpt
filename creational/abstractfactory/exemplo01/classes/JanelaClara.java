package creational.abstractfactory.exemplo01.classes;

import creational.abstractfactory.exemplo01.interfaces.Janela;

public class JanelaClara implements Janela {

    @Override
    public void exibir() {
        System.out.println("-> Exibir janela clara (bordas finas)");
    }
}
