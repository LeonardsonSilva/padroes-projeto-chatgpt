package unionpatterns.strategyandfactorymethod.exemplo01.classes;

import unionpatterns.strategyandfactorymethod.exemplo01.interfaces.CalculoFreteStrategy;

public class FreteBrasil implements CalculoFreteStrategy{

    @Override
    public double calcular(double valorPedido) {
        return 25.00 + (valorPedido * 0.02);
    }

}
