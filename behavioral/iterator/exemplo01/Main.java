package behavioral.iterator.exemplo01;

import behavioral.iterator.exemplo01.classes.Cardapio;
import behavioral.iterator.exemplo01.classes.ItemMenu;
import behavioral.iterator.exemplo01.interfaces.Iterator;

public class Main {
    public static void main(String[] args) {
        // cria o objeto coleção
        Cardapio cardapio = new Cardapio();

        // o cliente solicita o Iterator (o "Controle remoto")
        Iterator<ItemMenu> iterador = cardapio.criarIterator();
        System.out.println("--- Itens do Cardápio ---");

        // o cliente usa apenas a interface Iterator, sem saber que o Cardápio
        // internamente usa um Array
        while (iterador.temProximo()) {
            // enquanto houver um próximo item
            ItemMenu item = iterador.proximo();   // pega o proximo item

            // lógica do cliente, focada no ITEM, e não na travessia
            System.out.println("Item: " + item.getNome() + " | Preço: R$ " + item.getPreco());
        }

        /*
         * Se a coleção interna de Cardapio mudasse para uma LinkedList,
         * o CardapioIterator mudaria, mas o código Cliente (o while loop)
         * CONTINUARIA EXATAMENTE O MESMO.
         */
    }
}
