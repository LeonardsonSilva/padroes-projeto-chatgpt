package structural.decorator.exemplo02.classes;

import structural.decorator.exemplo02.interfaces.Bebida;

public class CafeExpresso implements Bebida {

    @Override
    public double custo() {
        return 5.0; // Custo base
    }

    @Override
    public String descricao() {
        return "Café Expresso";
    }


}
