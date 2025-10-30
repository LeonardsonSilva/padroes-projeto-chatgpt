package creational.factorymethod.exemplo01;

import creational.factorymethod.exemplo01.classes.Logistica;
import creational.factorymethod.exemplo01.classes.LogisticaMaritima;
import creational.factorymethod.exemplo01.classes.LogisticaTerrestre;

public class Main {
    public static void main(String[] args) {
        // o código cliente trabalha apenas com a interface do criador (Logistica)
        // e com o Criador concreto (LogisticaTerrestre ou LogisticaMaritima)

        Logistica logisticaTerrestre = new LogisticaTerrestre();
        // o cliente chama o método de uso, sem saber que um caminhão será criado.
        String resultadoTerrestre = logisticaTerrestre.planejarEntrega();
        System.out.println(resultadoTerrestre);

        Logistica logisticaMaritima = new LogisticaMaritima();
        // o cliente chama o mesmo método, mas um Navio é criado.
        String resultadoMaritimo = logisticaMaritima.planejarEntrega();
        System.out.println(resultadoMaritimo);
    }
}
