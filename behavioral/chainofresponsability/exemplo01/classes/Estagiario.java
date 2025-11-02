package behavioral.chainofresponsability.exemplo01.classes;


// manipulador concreto 1: lida com despesas até R$ 100
public class Estagiario extends AprovadorBase {
    private final double LIMITE = 100.0;

    @Override
    public void aprovar(Despesa despesa) {
        // Se a despesa estiver dentro do limite do Estagiário, ele a trata
        if (despesa.getValor() <= LIMITE) {
            System.out.println("Despesa de R$ "+ despesa.getValor() + " aprovada pelo estagiário.");
        } else {
            // caso contrário, passa para o próximo na cadeia
            System.out.println("Estagiário não pode aprovar R$ " + despesa.getValor() + ". Passando para o Gerente...");
            passarParaProximo(despesa);
        }
    }

}
