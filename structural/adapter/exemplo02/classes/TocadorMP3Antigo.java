package structural.adapter.exemplo02.classes;


// Adaptee: a classe legada com uma interface imcompatível
public class TocadorMP3Antigo {
    public void reproduzirMp3(String arquivo, int volume) {
        System.out.println("Tocador Antigo: Reproduzindo MP3: " + arquivo + " no volume " + volume);
    }

    // tem um método extra que o Cliente não usa
    public void parar() {
        System.out.println("Tocador antigo: parado");
    }
}
