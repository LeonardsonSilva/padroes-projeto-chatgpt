package behavioral.iterator.exemplo03_use_cabeca.classes;

import java.util.ArrayList;
import java.util.Iterator;

import behavioral.iterator.exemplo03_use_cabeca.interfaces.Menu;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /**
     * Não é mais necessário
     */
    // public ArrayList<MenuItem> getMenuItems() {
    //     return menuItems;
    // }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

    // outros métodos aqui
}
