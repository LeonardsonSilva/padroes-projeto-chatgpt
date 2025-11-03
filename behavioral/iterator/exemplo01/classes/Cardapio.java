package behavioral.iterator.exemplo01.classes;

import behavioral.iterator.exemplo01.interfaces.Agregador;
import behavioral.iterator.exemplo01.interfaces.Iterator;


// a coleção - agregado concreto
public class Cardapio implements Agregador<ItemMenu> {
    private ItemMenu[] itens;
    private static final int MAX_ITENS = 5;
    private int numeroDeItens = 0;

    public Cardapio() {
        itens = new ItemMenu[MAX_ITENS];
        adicionarItem("Cheeseburger", 15.00);
        adicionarItem("Batata Frita", 8.00);
        adicionarItem("Refrigerante", 6.00);
    }

    public void adicionarItem(String nome, double preco) {
        if (numeroDeItens < MAX_ITENS) {
            ItemMenu item = new ItemMenu(nome, preco);
            itens[numeroDeItens] = item;
            numeroDeItens++;
        } else {
            System.out.println("Cardápio cheio! Não é possível adicionar mais itens.");
        }
    }

    // o ponto-chave: o cardápio retorna um objeto Iterator para si mesmo
    @Override
    public Iterator<ItemMenu> criarIterator() {
        // cria uma instância do Iterador Concreto e passa o array interno.
        return new CardapioIterator(itens);
    }

}
