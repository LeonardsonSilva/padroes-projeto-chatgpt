package structural.bridge.exemplo02.classes;

import structural.bridge.exemplo02.interfaces.Color;


// implementação concreta
public class RedColor implements Color{

    @Override
    public String applyColor() {
        return "aplicando cor vermelha";
    }

}
