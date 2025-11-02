package behavioral.chainofresponsability.exemplo01;

import behavioral.chainofresponsability.exemplo01.classes.Despesa;
import behavioral.chainofresponsability.exemplo01.classes.Diretor;
import behavioral.chainofresponsability.exemplo01.classes.Estagiario;
import behavioral.chainofresponsability.exemplo01.classes.Gerente;
import behavioral.chainofresponsability.exemplo01.interfaces.Aprovador;

public class Main {
    public static void main(String[] args) {
        // construindo a cadeia de responsabilidade
        Aprovador estagiario = new Estagiario();
        Aprovador gerente = new Gerente();
        Aprovador diretor = new Diretor();

        // configura a ordem da cadeia: estagiári -> gerente -> diretor
        estagiario.setProximo(gerente);
        gerente.setProximo(diretor);
        // diretor não tem próximo (ele é o último)

        // solicitações de despesas (o cliente envia apenas para o primeiro)
        Despesa d1 = new Despesa(50.0, "Material de Escritório");
        Despesa d2 = new Despesa(750.0, "Passagem aérea");
        Despesa d3 = new Despesa(2500.0, "Novo servidor");

        System.out.println("--- Processando despesa 1 (R$ 50.0)");
        estagiario.aprovar(d1);

        System.out.println("\n");

        System.out.println("--- Processando despesa 2 (R$ 50.0)");
        estagiario.aprovar(d2);

        System.out.println("\n");

        System.out.println("--- Processando despesa 3 (R$ 2500.0)");
        estagiario.aprovar(d3);
    }
}
