package behavioral.iterator.exemplo03_use_cabeca.classes;

import java.util.ArrayList;
import java.util.Iterator;
import behavioral.iterator.exemplo03_use_cabeca.interfaces.Menu;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        System.out.println("\nMENU");
        System.out.println("-----------");
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            System.out.println("\n" + menu.getName());
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
