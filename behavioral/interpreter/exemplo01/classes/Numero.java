package behavioral.interpreter.exemplo01.classes;

import behavioral.interpreter.exemplo01.interfaces.Expressao;

public class Numero implements Expressao {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }
    @Override
    public int interpretar() {
        return numero;
    }

}
