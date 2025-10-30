package creational.factorymethod.exemplo01.classes;

import creational.factorymethod.exemplo01.interfaces.Transporte;


// Produto Concreto
public class Caminhao implements Transporte {
    @Override
    public String entregar() {
        return "Entrega realizada por via terrestre (Caminhão).";
    }
}
