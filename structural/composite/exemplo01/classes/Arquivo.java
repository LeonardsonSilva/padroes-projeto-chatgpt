package structural.composite.exemplo01.classes;

import structural.composite.exemplo01.interfaces.ComponenteSistema;

// folha (leaf)
// representa os objetos individuais que não podem conter outros
public class Arquivo implements ComponenteSistema {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirNome() {
        System.out.println("    - Arquivo: " + nome);
    }

}
