package creational.builder.exemplo03.classes;

public class Reporte {
    private String cabecalho;
    private String corpo;
    private String rodape;
    private String formato;  // para identificar o formato de saída

    private Reporte (String cabecalho, String corpo, String rodape, String formato) {
        this.cabecalho = cabecalho;
        this.corpo = corpo;
        this.rodape = rodape;
        this.formato = formato;
    }

    // método para ser chamado pelo cliente para obter o produto
    public static Reporte criar(String cabecalho, String corpo, String rodape, String formato) {
        return new Reporte(cabecalho, corpo, rodape, formato);
    }

    public void exibir() {
        System.out.println("--- RELATÓRIO NO FORMATO " + formato + " ---");
        System.out.println(cabecalho);
        System.out.println("-------------------------------------");
        System.out.println(corpo);
        System.out.println("-------------------------------------");
        System.out.println(rodape);
        System.out.println("-------------------------------------");
    }

}
