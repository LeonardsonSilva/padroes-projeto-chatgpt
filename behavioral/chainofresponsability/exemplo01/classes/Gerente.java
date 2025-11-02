package behavioral.chainofresponsability.exemplo01.classes;

public class Gerente extends AprovadorBase {
    private final double LIMITE = 1000.0;

    @Override
    public void aprovar(Despesa despesa) {
        if (despesa.getValor() <= LIMITE) {
            System.out.println("Despesa de R$ " + despesa.getValor() + " aprovada pelo Gerente.");
        } else {
            System.out.println("Gerente não pode aprovar R$ " + despesa.getValor() + ". Passando para o Diretor...");
            passarParaProximo(despesa);
        }
    }

}
