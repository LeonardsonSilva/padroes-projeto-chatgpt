package behavioral.interpreter.exemplo01.classes;

import behavioral.interpreter.exemplo01.interfaces.Expressao;

// representa um nó de operação (operador não-terminal)
public class Subtracao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Subtracao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar() {
        return esquerda.interpretar() - direita.interpretar();
    }

}
