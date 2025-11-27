package behavioral.iterator.exemplo03_use_cabeca;

import behavioral.iterator.exemplo03_use_cabeca.classes.DinerMenu;
import behavioral.iterator.exemplo03_use_cabeca.classes.PancakeHouseMenu;
import behavioral.iterator.exemplo03_use_cabeca.classes.Waitress;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
