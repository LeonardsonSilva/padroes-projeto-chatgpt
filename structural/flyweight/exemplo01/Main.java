package structural.flyweight.exemplo01;

import structural.flyweight.exemplo01.classes.Arvore;
import structural.flyweight.exemplo01.classes.FabricaTipoArvore;
import structural.flyweight.exemplo01.classes.TipoArvoreFlyweight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando simulação de floresta...\n");

        // definimos os tipos de árvore (estado intrínseco, compartilhado)
        // apenas duas instâncias de TipoArvoreFlyweight serão criadas
        TipoArvoreFlyweight carvalho = FabricaTipoArvore.getTipoArvore("Carvalho", "Verde Escuro", "TexturaCarvalho.png");
        TipoArvoreFlyweight pinheiro = FabricaTipoArvore.getTipoArvore("Pinheiro", "Verde Claro", "TexturaPinheiro.png");

        // criação de 5 árvores no mapa (objetos árvore)
        Arvore[] floresta = new Arvore[5];
        floresta[0] = new Arvore(10, 20, carvalho);
        floresta[1] = new Arvore(35, 40, pinheiro);
        floresta[2] = new Arvore(50, 60, carvalho);
        floresta[3] = new Arvore(75, 80, pinheiro);

        TipoArvoreFlyweight laranjeira = FabricaTipoArvore.getTipoArvore("Laranjeira", "Laranja", "TexturaLaranja.png");
        floresta[4] = new Arvore(90, 10, laranjeira);

        System.out.println("\n --- Desenhando a Floresta ---");
        for (Arvore arvore : floresta) {
            arvore.desenhar();
        }
    }
}
