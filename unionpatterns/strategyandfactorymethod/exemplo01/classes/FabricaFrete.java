package unionpatterns.strategyandfactorymethod.exemplo01.classes;

import unionpatterns.strategyandfactorymethod.exemplo01.interfaces.CalculoFreteStrategy;

public abstract class FabricaFrete {
    protected abstract CalculoFreteStrategy criarEstrategia();

    public double  processarPedido(double valorItens) {
        CalculoFreteStrategy estrategia = criarEstrategia();

        double frete = estrategia.calcular(valorItens);
        double total = valorItens + frete;

        System.out.printf("Cálculo efetuado pela fábrica %s. Frete: %.2f%n", this.getClass().getSimpleName(), frete);

        return total;
    }
}
