package unionpatterns.strategyandfactorymethod.exemplo01.classes;

import unionpatterns.strategyandfactorymethod.exemplo01.interfaces.CalculoFreteStrategy;

public class FabricaFreteBrasil extends FabricaFrete {

    @Override
    protected CalculoFreteStrategy criarEstrategia() {
        return new FreteBrasil();
    }

}
