package structural.bridge.exemplo01;

import structural.bridge.exemplo01.classes.AdvancedRemote;
import structural.bridge.exemplo01.classes.BasicRemote;
import structural.bridge.exemplo01.classes.Radio;
import structural.bridge.exemplo01.classes.Remote;
import structural.bridge.exemplo01.classes.TV;
import structural.bridge.exemplo01.interfaces.Device;

public class Main {
    public static void main(String[] args) {
        // criando ponte tv
        Device tv = new TV();
        Remote basicRemoteForTV = new BasicRemote(tv);

        System.out.println("--- Teste 1: controle básico (abstração) + tv (implementação)");
        basicRemoteForTV.power();
        basicRemoteForTV.volumeUp();
        tv.printStatus();

        System.out.println("--- Teste 2: controle avançado (abstração) + rádio (implementação)");
        // criando a ponte rádio
        Device radio = new Radio();
        AdvancedRemote advancedRemoteForRadio = new AdvancedRemote(radio);
        advancedRemoteForRadio.power();
        advancedRemoteForRadio.volumeUp();
        advancedRemoteForRadio.mute();
        radio.printStatus();



    }
}
