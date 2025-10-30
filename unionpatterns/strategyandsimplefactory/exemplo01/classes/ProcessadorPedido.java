package unionpatterns.strategyandsimplefactory.exemplo01.classes;

import unionpatterns.strategyandsimplefactory.exemplo01.interfaces.CalculoFrete;

public class ProcessadorPedido {
    private CalculoFrete estrategiaFrete;

    public ProcessadorPedido(String paisDestino) {
        this.estrategiaFrete = FabricaFrete.criarEstrategia(paisDestino);
    }

    public double calcularTotal(double valorItens) {
        double frete = estrategiaFrete.calcular(valorItens);
        double total = valorItens + frete;
        System.out.println("Frete calculado: " + frete);
        return total;
    }
}
