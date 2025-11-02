package behavioral.chainofresponsability.exemplo01.interfaces;

import behavioral.chainofresponsability.exemplo01.classes.Despesa;

// a interface base (Handler) para todos os aprovadores
public interface Aprovador {
    // define o próximo aprovador na cadeia
    void setProximo(Aprovador proximo);

    // método que lida com a solicitação
    void aprovar (Despesa despesa);
}
