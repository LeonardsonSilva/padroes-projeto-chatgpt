package unionpatterns.strategyandfactorymethod.exemplo01;

import unionpatterns.strategyandfactorymethod.exemplo01.classes.FabricaFrete;
import unionpatterns.strategyandfactorymethod.exemplo01.classes.FabricaFreteBrasil;
import unionpatterns.strategyandfactorymethod.exemplo01.classes.FabricaFreteEUA;

public class Main {
    public static void main(String [] args) {
        double valorBase = 100.00;

        FabricaFrete fabricaBrasil = new FabricaFreteBrasil();
        double totalBrasil = fabricaBrasil.processarPedido(valorBase);
        System.out.printf("Total Pedido Brasil: %.2f%n%n", totalBrasil);

        FabricaFrete fabricaEUA = new FabricaFreteEUA();
        double totalEUA = fabricaEUA.processarPedido(valorBase);
        System.out.printf("Total Pedido EUA: %.2f%n%n", totalEUA);
    }
}
