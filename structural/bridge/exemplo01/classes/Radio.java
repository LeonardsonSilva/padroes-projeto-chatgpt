package structural.bridge.exemplo01.classes;

import structural.bridge.exemplo01.interfaces.Device;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 30;

    @Override
    public boolean isEnabled() {
        return on;
    }
    @Override
    public void turnOn() {
        on = true;
        System.out.println(("Rádio: ligado."));
    }
    @Override
    public void turnOff() {
        on = false;
        System.out.println("Rádio: desligado.");
    }
    @Override
    public int getVolume() {
        return volume;
    }
    @Override
    public void setVolume(int percent) {
        if (on && percent >= 0 && percent <= 100) {
            this.volume = percent;
            System.out.println("Rádio: volume ajustado para " + volume + ".");
        }
    }
    @Override
    public void printStatus() {
        System.out.println("----------------");
        System.out.println("Rádio: " + (on ? "ligado" : "desligado"));
        System.out.println("Volume: " + volume);
        System.out.println("----------------");
    }

}
