package behavioral.observer.exemplo01.classes;

import behavioral.observer.exemplo01.interfaces.Observador;


// outra implementação do observador
public class TelaComAlerta implements Observador {
    private String nome;
    private final double limiteAlerta = 105.00;

    public TelaComAlerta(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(double novoPreco) {
        System.out.println("  [" + nome + "] - Novo Preço Recebido: R$" + novoPreco);
        if (novoPreco > limiteAlerta) {
            // Lógica de reação específica: dispara um alarme se o preço for muito alto.
            System.out.println("  *** ALERTA DE PREÇO: O preço da ação ultrapassou R$" + limiteAlerta + "! ***");
        }
    }

}
