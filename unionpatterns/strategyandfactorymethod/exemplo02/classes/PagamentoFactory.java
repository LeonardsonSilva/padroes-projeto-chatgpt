package unionpatterns.strategyandfactorymethod.exemplo02.classes;

import unionpatterns.strategyandfactorymethod.exemplo02.interfaces.PagamentoStrategy;

public abstract class PagamentoFactory {
    // nesse caso, a interface da estratégia é o produto
    public abstract PagamentoStrategy criarMetodoPagamento();
}
