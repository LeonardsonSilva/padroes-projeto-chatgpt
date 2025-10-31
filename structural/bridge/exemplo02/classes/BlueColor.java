package structural.bridge.exemplo02.classes;

import structural.bridge.exemplo02.interfaces.Color;


// implementação concreta
public class BlueColor implements Color{

    @Override
    public String applyColor() {
        return "aplicando cor azul";
    }

}
