package unionpatterns.strategyandfactorymethod.exemplo01.classes;

import unionpatterns.strategyandfactorymethod.exemplo01.interfaces.CalculoFreteStrategy;

public class FreteEUA implements CalculoFreteStrategy{

    @Override
    public double calcular(double valorPedido) {
        return 15.00 + (valorPedido * 0.01);
    }

}
