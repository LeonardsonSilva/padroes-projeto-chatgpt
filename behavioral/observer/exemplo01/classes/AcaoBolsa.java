package behavioral.observer.exemplo01.classes;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.exemplo01.interfaces.Observador;
import behavioral.observer.exemplo01.interfaces.Sujeito;

public class AcaoBolsa implements Sujeito {
    private List<Observador> observadores = new ArrayList<>();

    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        System.out.println("-> Preço da Ação alterado para: R$ " + novoPreco);
        this.preco = novoPreco;
        // quando o estado muda, a notificação é disparada
        notificarObservadores();
    }

    @Override
    public void anexar(Observador observador) {
        observadores.add(observador);
        System.out.println("Novo observador adicionado.");
    }

    @Override
    public void desanexar(Observador observador) {
        observadores.remove(observador);
        System.out.println("Observador removido");
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(this.preco);
        }
    }

}
