package structural.bridge.exemplo01.interfaces;


// No Bridge esse é a implementação. Essa interface é a ponte, Define a interface
// comum para todos os dispositivos. Diz "como fazer".
// É a parte que lida com as operações de baixo nível.
// A implementação se preocupa em fazer o trabalho.
// e.g. Como o Radio liga (talvez acionando um chip FM) ou como a TV liga (
// talvez acionando o display)
public interface Device {

    // métodos de controle de energia
    boolean isEnabled();
    void turnOn();
    void turnOff();

    // métodos de controle de volume
    int getVolume();
    void setVolume(int percent);

    // método de status
    void printStatus();
}
