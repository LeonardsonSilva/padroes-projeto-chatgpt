package unionpatterns.strategyandsimplefactory.exemplo01.classes;

import unionpatterns.strategyandsimplefactory.exemplo01.interfaces.CalculoFrete;

public class CalculoFreteEUA implements CalculoFrete{
    @Override
    public double calcular(double valorPedido) {
        return 15.00 + (valorPedido * 0.01);  // Frete + 1% do valor
    }
}
