package structural.facade.exemplo01.classes;


// classe facade
// fornece uma interface simples para iniciar o computador
public class ComputerFacade {
    // referências às instâncias dos subsistemas
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    // construtor que inicializa todos os subsistemas
    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    // método facade de alto nível
    // esconde toda a complexidade de ligar o computador
    public void ligarComputador() {
        System.out.println("\n--- Iniciando o Processo de Boot (complexo oculto) ---");
        cpu.start();
        String bootInfo = hardDrive.readBootSector();
        memory.load(bootInfo);
        cpu.execute();
        System.out.println("--- Processo de Boot Concluído ---\n");
    }

    // outro método facade, simplificando o desligamento
    public void desligarComputador() {
        System.out.println("\n --- Iniciando Desligamento ---");
        cpu.free();
        memory.free();
        System.out.println("--- Desligamento concluído ---");
    }
}
