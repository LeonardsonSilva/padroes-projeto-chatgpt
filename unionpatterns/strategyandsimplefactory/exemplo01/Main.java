package unionpatterns.strategyandsimplefactory.exemplo01;

import unionpatterns.strategyandsimplefactory.exemplo01.classes.ProcessadorPedido;

public class Main {
    public static void main(String[] args) {
        double valorBase = 100.00;

        ProcessadorPedido pedidoBrasil = new ProcessadorPedido("Brasil");
        System.out.println("Total Brasil: " + pedidoBrasil.calcularTotal((valorBase)));

        System.out.println("---");

        ProcessadorPedido pedidoEUA = new ProcessadorPedido("EUA");
        System.out.println("Total EUA: " + pedidoEUA.calcularTotal(valorBase));
    }
}
