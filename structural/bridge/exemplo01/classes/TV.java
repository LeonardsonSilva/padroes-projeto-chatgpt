package structural.bridge.exemplo01.classes;

import structural.bridge.exemplo01.interfaces.Device;

public class TV implements Device {
    private boolean on = false;
    private int volume = 20;

    @Override
    public boolean isEnabled() {
        return on;
    }
    @Override
    public void turnOn() {
        on = true;
        System.out.println(("TV: ligada."));
    }
    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV: desligada.");
    }
    @Override
    public int getVolume() {
        return volume;
    }
    @Override
    public void setVolume(int percent) {
        if (on && percent >= 0 && percent <= 100) {
            this.volume = percent;
            System.out.println("TV: volume ajustado para " + volume + ".");
        }
    }
    @Override
    public void printStatus() {
        System.out.println("----------------");
        System.out.println("TV: " + (on ? "ligada" : "desligada"));
        System.out.println("Volume: " + volume);
        System.out.println("----------------");
    }

}
