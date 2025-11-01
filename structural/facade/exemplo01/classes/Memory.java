package structural.facade.exemplo01.classes;

// subsistema 2
public class Memory {
    public void load (String info) {
        System.out.println("Memória: Carregando dados de boot: " + info);
    }

    public void free() {
        System.out.println("Memória: Liberando dados de boot.");
    }
}
