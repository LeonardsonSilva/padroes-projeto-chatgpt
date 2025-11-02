package behavioral.chainofresponsability.exemplo01.classes;

import behavioral.chainofresponsability.exemplo01.interfaces.Aprovador;


// classes abstrata que implementa a lógica de encadeamento
public abstract class AprovadorBase implements Aprovador {
    protected Aprovador proximoAprovador;  // referência para o próximo na cadeia

    @Override
    public void setProximo(Aprovador proximo) {
        this.proximoAprovador = proximo;
    }

    // método que verifica se deve passar para o próximo
    protected void passarParaProximo(Despesa despesa) {
        if (proximoAprovador != null) {
            // se houver um próximo, repassa a solicitação
            proximoAprovador.aprovar(despesa);
        } else {
            // se não houver, a solicitação não foi tratada
            System.out.println("Despesa de R$ " + despesa.getValor() + "(" + despesa.getDescricao() + ") não pôde ser aprovada.");
        }

    }


}
