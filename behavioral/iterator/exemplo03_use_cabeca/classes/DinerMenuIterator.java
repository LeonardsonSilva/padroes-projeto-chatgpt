package behavioral.iterator.exemplo03_use_cabeca.classes;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    // até algumas versões anteriores do java era obrigatório implementar o método remove de Iterator. Por isso que
    // tem essa implementação no livro.
    /**
     * Até a versão 8 do java era obrigatório implementar o método remove() da interface Iterator. Com a introdução de
     * métodos default nas interfaces, hoje não é mais necessário. Por isso que tem essa implementação no livro, porque
     * foi utilizado java 5.
     */
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position - 1] != null) {
            for (int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items [i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
