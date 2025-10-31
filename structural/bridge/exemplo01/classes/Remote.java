package structural.bridge.exemplo01.classes;

import structural.bridge.exemplo01.interfaces.Device;

// Remote é a "Abstração". A parte do sistema que o usuário interage. Ela define as operações de alto nível.
// Define "o quê" o negócio faz e não como. Ou seja, é o conjunto de comandos que o usuário vê: Ligar/Desligar,
// Aumentar Volume, Mudar de Canal etc. A abstração se preocupa em dizer: "Eu quero ligar o dispositivo", não ela não
// sabe como a TV ou Rádio (Devices) fazem isso.
public abstract class Remote {

    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void power() {
        if (device.isEnabled()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    public abstract void volumeUp();
    public abstract void volumeDown();

}
