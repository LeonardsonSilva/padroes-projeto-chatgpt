package behavioral.strategy.exemplo01.classes;

import behavioral.strategy.exemplo01.interfaces.CalculoFreteStrategy;

public class FretePAC implements CalculoFreteStrategy{

    @Override
    public double calcular(double pesoEmKg) {
        return 5.00 + (1.00 * pesoEmKg);
    }

}
