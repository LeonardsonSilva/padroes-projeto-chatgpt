package behavioral.interpreter.exemplo01.classes;

import behavioral.interpreter.exemplo01.interfaces.Expressao;

// representa um nó de operação (operador não-terminal)
public class Soma implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    // a interpretação d euma soma é a soma dos resultados da interpretação
    // da expressão da esquerda e da expressão da direita
    @Override
    public int interpretar() {
        return esquerda.interpretar() + direita.interpretar();
    }

}
