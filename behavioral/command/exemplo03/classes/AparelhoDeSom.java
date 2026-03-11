package behavioral.command.exemplo02.classes;

// classe Receiver (o Receptor)
// o objeto que sabe realizar a ação real
public class AparelhoDeSom {
    // o estado do objeto
    private String local;

    public AparelhoDeSom(String local) {
        this.local = local;
    }

    public void ligar() {
        System.out.println(local + " Aparelho de Som está LIGADO.");
        System.out.println("Volume ajustado para 10.");
    }

    // outra ação específica do Receiver
    public void desligar() {
        System.out.println(local + " Aparelho de Som está DESLIGADO.");
    }
}
