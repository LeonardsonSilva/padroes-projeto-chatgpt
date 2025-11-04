package behavioral.interpreter.exemplo01;

import behavioral.interpreter.exemplo01.classes.Numero;
import behavioral.interpreter.exemplo01.classes.Soma;
import behavioral.interpreter.exemplo01.classes.Subtracao;
import behavioral.interpreter.exemplo01.interfaces.Expressao;

public class Main {
    public static void main(String[] args) {
        Expressao dez = new Numero(10);
        Expressao cinco = new Numero(5);
        Expressao dois = new Numero(2);

        Expressao soma = new Soma(dez, cinco);

        Expressao expressaoCompleta = new Subtracao(soma, dois);

        int resultado = expressaoCompleta.interpretar();

        System.out.println("O resultado da expressão (10 + 5) - 2 é: " + resultado);


    }
}
