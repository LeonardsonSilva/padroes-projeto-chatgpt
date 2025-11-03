package behavioral.strategy.exemplo01.classes;

import behavioral.strategy.exemplo01.interfaces.CalculoFreteStrategy;


public class CarrinhoDeCompras {
    private CalculoFreteStrategy estrategiaDeFrete;

    public CarrinhoDeCompras(CalculoFreteStrategy estrategiaDeFrete) {
        this.estrategiaDeFrete = estrategiaDeFrete;
    }

    public void setEstrategiaDeFrete(CalculoFreteStrategy novaEstrategia) {
        this.estrategiaDeFrete = novaEstrategia;
    }

    public double calcularValorFrete(double pesoEmKg) {
        return this.estrategiaDeFrete.calcular(pesoEmKg);
    }

}
