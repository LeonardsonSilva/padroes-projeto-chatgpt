package structural.composite.exemplo03_use_cabeca.classes;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
         this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
