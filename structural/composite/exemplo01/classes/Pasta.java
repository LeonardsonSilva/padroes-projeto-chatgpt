package structural.composite.exemplo01.classes;

import java.util.ArrayList;
import java.util.List;

import structural.composite.exemplo01.interfaces.ComponenteSistema;


// composto (Composite)
// representa objetos que podem conter outros componentes (pastas)
public class Pasta implements ComponenteSistema {
    private String nome;
    private List<ComponenteSistema> componentes = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(ComponenteSistema componente) {
        componentes.add(componente);
    }

    public void remover(ComponenteSistema componente) {
        componentes.remove(componente);
    }

    // implementação da operação comum: o composto delega a operação ao seus filhos
    @Override
    public void exibirNome() {
        System.out.println("+ PASTA: " + nome);

        for (ComponenteSistema componente : componentes) {
            componente.exibirNome();
        }
    }

}
