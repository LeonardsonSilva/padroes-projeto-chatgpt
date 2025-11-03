package structural.decorator.exemplo02.classes;

import structural.decorator.exemplo02.interfaces.Bebida;

// decorator (Classe abstrata do Decorator)
// ele deve implementar a interface bebida e guardar uma referência para um  Bebida
public abstract class AdicionalDecorator implements Bebida {
    // referência ao objeto que está sendo decorado (pode ser um CafeExpresso ou outro AdicionalDecorator)
    protected Bebida bebidaDecorada;

    // o construto é usado para envolver (wrap) o objeto.
    public AdicionalDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    // por padrão, delega as chamadas para o objeto interno.
    // as classes concretas sobrescreverão este meodo para adicionar seus próprios custos/descrições
    @Override
    public abstract String descricao();
}
