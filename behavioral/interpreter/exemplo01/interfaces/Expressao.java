package behavioral.interpreter.exemplo01.interfaces;


// define a interface comum para todas as expressões (blocos)
public interface Expressao {
    // todas as expressões devem saber com se interpretar (calcular)
    int interpretar();
}
