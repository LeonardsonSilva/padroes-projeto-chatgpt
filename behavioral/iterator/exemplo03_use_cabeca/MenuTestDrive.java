package behavioral.iterator.exemplo03_use_cabeca;

import behavioral.iterator.exemplo03_use_cabeca.classes.DinerMenu;
import behavioral.iterator.exemplo03_use_cabeca.classes.PancakeHouseMenu;
import behavioral.iterator.exemplo03_use_cabeca.classes.Waitress;
import behavioral.iterator.exemplo03_use_cabeca.interfaces.Menu;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
