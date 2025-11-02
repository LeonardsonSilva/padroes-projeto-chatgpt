package behavioral.chainofresponsability.exemplo01.classes;


// manipulador concreto 3: lida com despesas acima de R$ 1000
public class Diretor extends AprovadorBase {

    @Override
    public void aprovar(Despesa despesa) {
        // assume que o diretor aprova qualquer valor restante (acima de 1000)
        System.out.println("Despesa de R$ " + despesa.getValor() + " aprovada pelo Diretor.");
        // Não há próximo, então se for aprovada aqui, o processo termina.
    }

}
