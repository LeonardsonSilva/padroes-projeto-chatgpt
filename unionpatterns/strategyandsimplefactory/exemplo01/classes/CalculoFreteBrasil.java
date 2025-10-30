package unionpatterns.strategyandsimplefactory.exemplo01.classes;

import unionpatterns.strategyandsimplefactory.exemplo01.interfaces.CalculoFrete;

public class CalculoFreteBrasil implements CalculoFrete{
    @Override
    public double calcular(double valorPedido) {
        return 25.00 + (valorPedido * 0.02);  // Frete + 2% do valor
    }
}
