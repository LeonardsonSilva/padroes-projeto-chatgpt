package behavioral.iterator.exemplo01.classes;

import behavioral.iterator.exemplo01.interfaces.Iterator;


public class CardapioIterator implements Iterator<ItemMenu> {
    private ItemMenu[] itens;  // referência ao array interno da coleção Cardapio
    private int posicao = 0;  // estado do Iterador: índice atual no array

    // construtor que recebe o array para iterar
    public CardapioIterator(ItemMenu[] itens) {
        this.itens = itens;
    }

    @Override
    public boolean temProximo() {
        // verifica se a posição atual é menor que o tamanho do array
        // e se o elemento na posição não é nulo (caso o array não esteja cheio)
        return posicao < itens.length && itens[posicao] != null;
    }

    @Override
    public ItemMenu proximo() {
        // pega o item na posição atual
        ItemMenu itemMenu = itens[posicao];
        posicao++;  // move o iterador para o próximo elemento
        return itemMenu;
    }

}
