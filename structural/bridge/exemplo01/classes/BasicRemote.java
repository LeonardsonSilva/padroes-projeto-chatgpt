package structural.bridge.exemplo01.classes;

import structural.bridge.exemplo01.interfaces.Device;


public class BasicRemote extends Remote {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 5);
        System.out.println("Controle básico: aumenta volume em 5.");
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 5);
        System.out.println("Controle básico: diminui volume em 5.");
    }

}
