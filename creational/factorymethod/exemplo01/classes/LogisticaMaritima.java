package creational.factorymethod.exemplo01.classes;

import creational.factorymethod.exemplo01.interfaces.Transporte;


// Criador concreto
public class LogisticaMaritima extends Logistica {

    @Override
    protected Transporte criarTransporte() {
        return new Navio();
    }
}
