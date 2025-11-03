package behavioral.strategy.exemplo01.classes;

import behavioral.strategy.exemplo01.interfaces.CalculoFreteStrategy;


public class FreteSedex implements CalculoFreteStrategy{

    @Override
    public double calcular(double pesoEmKg) {
        return 15.00 + (3.00 * pesoEmKg);
    }

}
