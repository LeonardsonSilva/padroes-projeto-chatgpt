package creational.builder.exemplo03.interfaces;

import creational.builder.exemplo03.classes.Reporte;

public interface ReporteBuilder {
    void construirCabecalho(String titulo, String autor);
    void construirCorpo(String conteudo);
    void construirRodape(String dataGeracao);

    // método para obter o produto final
    Reporte getResultado();
}
