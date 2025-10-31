package structural.decorator.exemplo01.classes;

import structural.decorator.exemplo01.interfaces.Bebida;

public class ChocolateDecorator extends AdicionalDecorator {

    public ChocolateDecorator(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public double custo() {
        return bebidaDecorada.custo() + 2.0;
    }

    @Override
    public String descricao() {
        return bebidaDecorada.descricao() + ", Chocolate";
    }

}
