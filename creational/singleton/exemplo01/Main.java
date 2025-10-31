package creational.singleton.exemplo01;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Primeira Chamada ---");
        ConfiguracaoSistema config1 = ConfiguracaoSistema.getInstance();
        System.out.println("Tema atual em Config1: " + config1.getTema());
        config1.mostrarHash();

        // altera um valor na primeira instância
        config1.setTema("escuro");

        // obtém a "segunda instância" (na verdade é a mesma!)
        System.out.println("\n--- Segunda chamada ---");
        ConfiguracaoSistema config2 = ConfiguracaoSistema.getInstance();
        System.out.println("Tema atual em Config2: " + config2.getTema());
        config2.mostrarHash();
    }
}
