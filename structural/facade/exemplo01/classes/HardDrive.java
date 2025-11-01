package structural.facade.exemplo01.classes;


// subsitema 3
public class HardDrive {
    public String readBootSector() {
        System.out.println("HardDrive: lendo setor de boot.");
        return "DadosIniciaisDoSistema";
    }
}
