package behavioral.strategy.exemplo01.classes;

import behavioral.strategy.exemplo01.interfaces.CalculoFreteStrategy;


public class FreteRetirada implements CalculoFreteStrategy{

    @Override
    public double calcular(double pesoEmKg) {
        return 0.00;
    }
}
