package behavioral.templatemethod.exemplo01;

import behavioral.templatemethod.exemplo01.classes.BebidaCafeinada;
import behavioral.templatemethod.exemplo01.classes.Cafe;
import behavioral.templatemethod.exemplo01.classes.Cha;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Preparando Café ---");
        BebidaCafeinada meuCafe = new Cafe();
        meuCafe.prepararReceita();

        System.out.println("\n--- Preparando Chá ---");
        BebidaCafeinada meuCha = new Cha();
        // chamamos o Template Method novamente. O fluxo é o mesmo, mas a execução dos
        // passos abstratos e do gancho muda.
        meuCha.prepararReceita();
    }
}
