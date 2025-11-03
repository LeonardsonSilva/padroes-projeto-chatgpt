package structural.decorator.exemplo02.classes;

import structural.decorator.exemplo02.interfaces.Bebida;

public class ChocolateDecorator extends AdicionalDecorator {

    public ChocolateDecorator(Bebida bebidaDecorada) {
        super(bebidaDecorada);  // chama o construtor do decorator base
    }

    @Override
    public double custo() {
        return bebidaDecorada.custo() + 2.5;
    }

    @Override
    public String descricao() {
        return bebidaDecorada.descricao() + ", Chocolate";
    }


}
