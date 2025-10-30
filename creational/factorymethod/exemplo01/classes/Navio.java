package creational.factorymethod.exemplo01.classes;

import creational.factorymethod.exemplo01.interfaces.Transporte;


// Produto Concreto
public class Navio implements Transporte {
    @Override
    public String entregar() {
        return "Entrega realizada por via marítima (Navio).";
    }
}
