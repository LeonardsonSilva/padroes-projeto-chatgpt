package creational.prototype.exemplo01;

import creational.prototype.exemplo01.classes.Circulo;
import creational.prototype.exemplo01.classes.Retangulo;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Criando Protótipo Original (Inicialização Potencialmente Lenta) ---");

        Circulo prototipoCirculoAzul = new Circulo();
        prototipoCirculoAzul.x = 10;
        prototipoCirculoAzul.y = 20;
        prototipoCirculoAzul.raio = 5;
        prototipoCirculoAzul.cor = "azul";
        prototipoCirculoAzul.desenhar();

        System.out.println("Clonando objetos (operação rápida)");

        // o cliente trabalha com a interface FormaGeometrica (ou o método clone())
        // sem saber se está clonando um Circulo ou Retangulo!

        // cria uma cópia exata do protótipo (Protótipo -> Cópia 1)
        Circulo circuloCopia1 = (Circulo) prototipoCirculoAzul.clone();

        // cria outra cópia e altera apenas a cor (Protótipo -> Cópia 2)
        Circulo circuloCopia2 = (Circulo) prototipoCirculoAzul.clone();
        circuloCopia2.cor = "vermelho";
        circuloCopia2.raio = 8;


        // Demonstração do Retângulo
        Retangulo prototipoRetanguloVerde = new Retangulo();
        prototipoRetanguloVerde.x = 50;
        prototipoRetanguloVerde.y = 60;
        prototipoRetanguloVerde.largura = 10;
        prototipoRetanguloVerde.altura = 5;
        prototipoRetanguloVerde.cor = "verde";

        Retangulo retanguloCopia = (Retangulo) prototipoRetanguloVerde.clone();
        retanguloCopia.largura = 20;

        // o
        System.out.println("\n--- Exibindo Objetos Clonados ---");
        System.out.println("Original == Cópia 1? " + (prototipoCirculoAzul == circuloCopia1));  // deve ser false
        System.out.println("Original cor: " + prototipoCirculoAzul.cor + " | Cópia 2 cor: " + circuloCopia2.cor);

    }
}
