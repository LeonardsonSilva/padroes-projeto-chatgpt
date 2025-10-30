package unionpatterns.strategyandfactorymethod.exemplo02;

import unionpatterns.strategyandfactorymethod.exemplo02.classes.CartaoFactory;
import unionpatterns.strategyandfactorymethod.exemplo02.classes.PagamentoFactory;
import unionpatterns.strategyandfactorymethod.exemplo02.classes.ServicoPagamento;

public class Main {
    public static void main(String[] args) {
        PagamentoFactory metodoPagamento = new CartaoFactory();
        ServicoPagamento servicoPagamento = new ServicoPagamento(metodoPagamento);
        servicoPagamento.executarPagamento(100);
    }
}
