package behavioral.strategy.exemplo01.interfaces;


// define a interface comum para todos os algoritmos de cálculo de frete.
// o contexto (Carrinho) só enxerga esta interface
public interface CalculoFreteStrategy {
    double calcular(double pesoEmKg);
}
