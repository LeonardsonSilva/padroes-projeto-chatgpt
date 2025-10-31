package structural.decorator.exemplo01.classes;

import structural.decorator.exemplo01.interfaces.Bebida;


// concrete component (a implementação base)
public class CafeExpresso implements Bebida {

    @Override
    public double custo() {
        return 5.0;
    }

    @Override
    public String descricao() {
        return "Café Expresso";
    }

}
