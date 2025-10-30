package unionpatterns.strategyandfactorymethod.exemplo02.classes;

import unionpatterns.strategyandfactorymethod.exemplo02.interfaces.PagamentoStrategy;

public class PagamentoPix implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " com Pix.");
    }

}
