package creational.factorymethod.exemplo01.classes;

import creational.factorymethod.exemplo01.interfaces.Transporte;


// Criador concreto
public class LogisticaTerrestre extends Logistica {
    @Override
    protected Transporte criarTransporte() {
        // a subclasse decide qual classe concreta instanciar
        return new Caminhao();
    }
}
