package behavioral.iterator.exemplo03_use_cabeca.classes;

import behavioral.iterator.exemplo03_use_cabeca.interfaces.Iterator;
import behavioral.iterator.exemplo03_use_cabeca.interfaces.Menu;

public class DinerMenu implements Menu{
    static final int MAX_ITENS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITENS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITENS) {
            System.err.println("Sorry, menu is full! Can't add item to menu.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    /**
     * não precisamos mais do método getMenuItems(). De fato, queremos nos livrar dele, porque ele expõe nossa
    **/
    // implementação interna!
    // public MenuItem[] getMenuItems() {
    //     return menuItems;
    // }

    /**
     * Aqui está o método createIterator(), que cria um DinerMenuIterator a partir da matriz menuItems e o retorna ao cliente.
     * Estamos retornando a interface Iterator. O cliente não precisa saber como os itens de menu são mantidos no menu do
     * restaurante, nem como DinerMenuIterator é implementado. Ele só precisa usar os iteradores para acessar consecutivamente
     * os itens do menu.
    **/
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }


    // outros métodos aqui
}
