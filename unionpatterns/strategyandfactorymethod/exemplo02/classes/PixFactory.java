package unionpatterns.strategyandfactorymethod.exemplo02.classes;

import unionpatterns.strategyandfactorymethod.exemplo02.interfaces.PagamentoStrategy;

public class PixFactory extends PagamentoFactory {

    @Override
    public PagamentoStrategy criarMetodoPagamento() {
        return new PagamentoPix();
    }

}
