package behavioral.strategy.exemplo01;

import behavioral.strategy.exemplo01.classes.CarrinhoDeCompras;
import behavioral.strategy.exemplo01.classes.FretePAC;
import behavioral.strategy.exemplo01.classes.FreteRetirada;
import behavioral.strategy.exemplo01.classes.FreteSedex;

public class Main {
    public static void main(String[] args) {
        double pesoTotal = 10.0;

        System.out.println("--- Escolha: SEDEX ---");
        CarrinhoDeCompras carrinhoSedex = new CarrinhoDeCompras(new FreteSedex());
        double valorSedex = carrinhoSedex.calcularValorFrete(pesoTotal);

        System.out.println("Frete Sedex para " + pesoTotal + "Kg: R$ " + valorSedex);

        System.out.println("\n--- Escolha: PAC ---");
        carrinhoSedex.setEstrategiaDeFrete(new FretePAC());
        double valorPAC = carrinhoSedex.calcularValorFrete(pesoTotal);
        System.out.println("Frete Sedex para " + pesoTotal + "Kg: R$ " + valorPAC);

        System.out.println("\n--- Escolha: Retirada ---");
        carrinhoSedex.setEstrategiaDeFrete(new FreteRetirada());
        double valorRetirada = carrinhoSedex.calcularValorFrete(pesoTotal);
        System.out.println("Frete Sedex para " + pesoTotal + "Kg: R$ " + valorRetirada);
    }
}
