package behavioral.observer.exemplo01;

import behavioral.observer.exemplo01.classes.AcaoBolsa;
import behavioral.observer.exemplo01.classes.TelaComAlerta;
import behavioral.observer.exemplo01.classes.TelaSimples;
import behavioral.observer.exemplo01.interfaces.Observador;

public class Main {
    public static void main(String[] args) {
        AcaoBolsa acao = new AcaoBolsa();

        Observador telaPrincipal = new TelaSimples("Tela Principal");
        Observador telaComAlerta = new TelaComAlerta("Tela de Risco");
        Observador telaAuxiliar = new TelaSimples("Mini Widget");

        acao.anexar(telaPrincipal);
        acao.anexar(telaComAlerta);

        System.out.println("\n--- MUDANÇA DE ESTADO 1 ---");
        acao.setPreco(99.50);

        System.out.println("\n--- NOVO OBSERVADOR É ANEXADO ---");
        acao.anexar(telaAuxiliar);

        System.out.println("\n--- MUDANÇA DE ESTADO 2 (Vai disparar Alerta) ---");
        acao.setPreco(110.25);

        System.out.println("\n--- UM OBSERVADOR É DESANEXADO ---");
        acao.desanexar(telaAuxiliar);

        System.out.println("\n--- MUDANÇA DE ESTADO 3 (notifica 2 observadores restantes) ---");
        acao.setPreco(102.00);
    }
}
