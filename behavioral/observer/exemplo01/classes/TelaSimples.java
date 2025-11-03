package behavioral.observer.exemplo01.classes;

import behavioral.observer.exemplo01.interfaces.Observador;

public class TelaSimples implements Observador {
    private String nome;

    public TelaSimples(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(double novoPreco) {
        System.out.println("  [" + nome + "] - Novo Preço Recebido: R$" + novoPreco);
    }

}
