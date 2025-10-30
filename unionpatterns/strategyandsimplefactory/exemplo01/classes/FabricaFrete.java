package unionpatterns.strategyandsimplefactory.exemplo01.classes;

import unionpatterns.strategyandsimplefactory.exemplo01.interfaces.CalculoFrete;

public class FabricaFrete {
    public static CalculoFrete criarEstrategia(String paisDestino) {
        if (paisDestino.equalsIgnoreCase("BRASIL")) {
            return new CalculoFreteBrasil();
        } else if (paisDestino.equalsIgnoreCase("EUA")) {
            return new CalculoFreteEUA();
        } else {
            return new CalculoFreteBrasil();  // estratégia padrão para países não suportados
        }
    }
}
