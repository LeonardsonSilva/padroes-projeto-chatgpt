package behavioral.chainofresponsability.exemplo01.classes;


// a solicitação/pedido que será repassado na cadeia
public class Despesa {
    private double valor;
    private String descricao;

    public Despesa(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }


}
