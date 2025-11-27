package behavioral.iterator.exemplo03_use_cabeca.classes;

import java.util.Hashtable;

import behavioral.iterator.exemplo03_use_cabeca.interfaces.Iterator;
import behavioral.iterator.exemplo03_use_cabeca.interfaces.Menu;

public class CafeMenu implements Menu{
    Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato and fries", true, 3.99);
        addItem("Soup of the day", "A cup of soup of the day with a side salad.", false, 3.69);
        addItem("Burrito", "A large burrito with whole pretty beans, salsa, guacamole.", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    // Não será mais necessário
    // public Hashtable<String, MenuItem> getItems() {
    //     return menuItems;
    // }

    @Override
    public Iterator createIterator() {
        return (Iterator) menuItems.values().iterator();
    }
}
