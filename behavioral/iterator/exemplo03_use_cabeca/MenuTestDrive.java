package behavioral.iterator.exemplo03_use_cabeca;

import java.util.ArrayList;

import behavioral.iterator.exemplo03_use_cabeca.classes.CafeMenu;
import behavioral.iterator.exemplo03_use_cabeca.classes.DinerMenu;
import behavioral.iterator.exemplo03_use_cabeca.classes.PancakeHouseMenu;
import behavioral.iterator.exemplo03_use_cabeca.classes.Waitress;
import behavioral.iterator.exemplo03_use_cabeca.interfaces.Menu;

public class MenuTestDrive {
    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();
        Menu pancakeHouseMenu = new PancakeHouseMenu("BREAKFAST");
        Menu dinerMenu = new DinerMenu("LUNCH");
        Menu cafeMenu = new CafeMenu("DINNER");

        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
