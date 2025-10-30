package unionpatterns.strategyandfactorymethod.exemplo02.classes;

import unionpatterns.strategyandfactorymethod.exemplo02.interfaces.PagamentoStrategy;

public class CartaoFactory extends PagamentoFactory {

    @Override
    public PagamentoStrategy criarMetodoPagamento() {
        return new PagamentoCartao();
    }

}
