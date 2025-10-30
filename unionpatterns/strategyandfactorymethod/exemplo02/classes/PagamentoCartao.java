package unionpatterns.strategyandfactorymethod.exemplo02.classes;

import unionpatterns.strategyandfactorymethod.exemplo02.interfaces.PagamentoStrategy;

public class PagamentoCartao implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " com Cartão de Crédito.");
    }

}
