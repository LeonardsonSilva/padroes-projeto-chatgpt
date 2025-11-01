package structural.facade.exemplo01.classes;


// subsistema 1
public class CPU {
    public void start() {
        System.out.println("CPU: Inicialização básica da CPU.");
    }

    public void execute() {
        System.out.println("CPU: executando rotinas de inicialização.");
    }

    public void free() {
        System.out.println("CPU: Liberando registradores.");
    }
}
