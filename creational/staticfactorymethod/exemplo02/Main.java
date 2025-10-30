package creational.staticfactorymethod.exemplo02;

import creational.staticfactorymethod.exemplo02.classes.ColecoesUtilitarias;
import creational.staticfactorymethod.exemplo02.interfaces.ListaImutavel;

public class Main {
    public static void main(String[] args) {
        ListaImutavel<String> listaA = ColecoesUtilitarias.of();
        System.out.println("Lista A: " + listaA.descricao() + ", Tamanho: " + listaA.size());

        ListaImutavel<Integer> listaB = ColecoesUtilitarias.of(42);
        System.out.println("Lista B: " + listaB.descricao() + ", Tamanho: " + listaB.size());
        System.out.println("Item [0]: " + listaB.get(0));

        ListaImutavel<String> listaC = ColecoesUtilitarias.of("Pera", "Uva", "Maçã");
        System.out.println("Lista C: " + listaC.descricao() + ", Tamanho: " + listaC.size());
        System.out.println("Item [1]: " + listaC.get(1));
    }
}
