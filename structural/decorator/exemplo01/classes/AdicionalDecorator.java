package structural.decorator.exemplo01.classes;

import structural.decorator.exemplo01.interfaces.Bebida;


// decorator (classe abstrata do decorador)
// ele deve implementar a interface Bebida e guardar uma referência para um objeto Bebida
public abstract class AdicionalDecorator implements Bebida {

    // Referência ao objeto que está sendo decorado (pode ser um CafeExpresso ou outro AdicionalDecorator)
    protected Bebida bebidaDecorada;

    public AdicionalDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public abstract String descricao();

}
