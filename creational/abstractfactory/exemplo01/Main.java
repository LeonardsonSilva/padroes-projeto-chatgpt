package creational.abstractfactory.exemplo01;

import creational.abstractfactory.exemplo01.classes.Aplicacao;
import creational.abstractfactory.exemplo01.classes.DarkThemeFactory;
import creational.abstractfactory.exemplo01.classes.LightThemeFactory;
import creational.abstractfactory.exemplo01.interfaces.ComponenteFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- USANDO TEMA CLARO (LIGHT) ---");
        ComponenteFactory lightFactory = new LightThemeFactory();
        Aplicacao appLight = new Aplicacao(lightFactory);
        appLight.pintarInterface();

        System.out.println("--- USANDO TEMA ESCURO (DARK) ---");
        ComponenteFactory darkFactory = new DarkThemeFactory();
        Aplicacao appDark = new Aplicacao(darkFactory);
        appDark.pintarInterface();
    }
}
