package structural.decorator.exemplo01.classes;

import structural.decorator.exemplo01.interfaces.Bebida;


// concrete decorator (adicional de leite)
public class LeiteDecorator extends AdicionalDecorator {

    public LeiteDecorator(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public double custo() {
        return bebidaDecorada.custo() + 1.5;
    }

    @Override
    public String descricao() {
        return bebidaDecorada.descricao() + ", Leite";
    }

}
