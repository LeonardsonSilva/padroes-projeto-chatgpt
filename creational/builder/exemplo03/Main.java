package creational.builder.exemplo03;

import creational.builder.exemplo03.classes.HtmlReporteBuilder;
import creational.builder.exemplo03.classes.PdfReporteBuilder;
import creational.builder.exemplo03.classes.Reporte;
import creational.builder.exemplo03.classes.ReporteDirector;
import creational.builder.exemplo03.interfaces.ReporteBuilder;

public class Main {
    public static void main(String[] args) {
        ReporteDirector director = new ReporteDirector();
        String titulo = "Relatório de Vendas Trimestrais";
        String autor = "Equipe de Análise";
        String conteudo = "O primeiro trimestre apresentou crescimento de 10% no setor A. O setor B, no entanto, teve uma queda de 5%. A projeção para o próximo trimestre é otimista, esperando-se a recuperação do setor B.";
        String dataGeracao = "05/11/2025";

        ReporteBuilder pdfBuilder = new PdfReporteBuilder();
        director.construirRelatorioPadrao(pdfBuilder, titulo, autor, conteudo, dataGeracao);

        Reporte relatorioPdf = pdfBuilder.getResultado();
        relatorioPdf.exibir();

        ReporteBuilder htmlBuilder = new HtmlReporteBuilder();
        director.construirRelatorioPadrao(htmlBuilder, titulo, autor, conteudo, dataGeracao);

        Reporte relatorioHtml = htmlBuilder.getResultado();
        relatorioHtml.exibir();
    }
}
