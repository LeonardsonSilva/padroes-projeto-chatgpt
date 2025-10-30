package unionpatterns.strategyandfactorymethod.exemplo02.classes;

import unionpatterns.strategyandfactorymethod.exemplo02.interfaces.PagamentoStrategy;

public class ServicoPagamento {
    private PagamentoStrategy pagamento;

    public ServicoPagamento(PagamentoFactory factory) {
        this.pagamento = factory.criarMetodoPagamento();
    }

    // verificar se esse método pode ficar dentro de PagamentoFactory
    public void executarPagamento(double valor) {
        pagamento.pagar(valor);
    }
}
