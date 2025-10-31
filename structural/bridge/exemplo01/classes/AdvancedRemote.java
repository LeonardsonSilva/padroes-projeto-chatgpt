package structural.bridge.exemplo01.classes;

import structural.bridge.exemplo01.interfaces.Device;


public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
        System.out.println("Controle avançado: aumenta volume em 5.");
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
        System.out.println("Controle avançado: diminui volume em 5.");
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Controle Avançado: dispositivo silenciado.");
    }

}
