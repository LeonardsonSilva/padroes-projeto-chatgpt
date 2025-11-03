package structural.decorator.exemplo02;

import structural.decorator.exemplo02.classes.CafeExpresso;
import structural.decorator.exemplo02.classes.ChocolateDecorator;
import structural.decorator.exemplo02.classes.LeiteDecorator;
import structural.decorator.exemplo02.interfaces.Bebida;

public class Main {
    public static void main(String[] args) {
        Bebida meuCafe = new CafeExpresso();
        System.out.println(meuCafe.descricao() + " | Custo: R$" + meuCafe.custo());

        meuCafe = new LeiteDecorator(meuCafe);
        System.out.println(meuCafe.descricao() + " | Custo: R$" + meuCafe.custo());

        meuCafe = new ChocolateDecorator(meuCafe);
        System.out.println(meuCafe.descricao() + " | Custo: R$" + meuCafe.custo());
    }
}
