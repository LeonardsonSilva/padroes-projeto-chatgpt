package creational.staticfactorymethod.exemplo01;

import creational.staticfactorymethod.exemplo01.classes.Cor;

public class Main {
    public static void main(String[] args) {
        Cor corVerde = Cor.criarAPartirRGB(0, 128, 0);
        System.out.println("Criação RGB: " + corVerde);

        Cor corHex = Cor.criarAPartirHex("#FF0000");
        System.out.println("Criação Hex: " + corHex);

        Cor corUnica1 = Cor.getCorPreta();
        Cor corUnica2 = Cor.getCorPreta();

        System.out.println("Criação Cacheada: " + (corUnica1 == corUnica2));
    }
}
