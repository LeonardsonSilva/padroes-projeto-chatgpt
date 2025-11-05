package creational.builder.exemplo03.classes;

import creational.builder.exemplo03.interfaces.ReporteBuilder;

public class PdfReporteBuilder implements ReporteBuilder {
    private String cabecalhoPdf;
    private String corpoPdf;
    private String rodapePdf;

    @Override
    public void construirCabecalho(String titulo, String autor) {
        this.cabecalhoPdf = "<PDF_HEADER> Título: " + titulo.toUpperCase() + " | Autor: " + autor + " </PDF_HEADER>";
    }

    @Override
    public void construirCorpo(String conteudo) {
        this.corpoPdf = "<PDF_BODY>\n" + conteudo.replaceAll("\\.", ".\n") + "\n</PDF_BODY>";
    }

    @Override
    public void construirRodape(String dataGeracao) {
        this.rodapePdf = "<PDF_FOOTER> Gerado em: " + dataGeracao + " (Confidencial) </PDF_FOOTER>";
    }

    @Override
    public Reporte getResultado() {
        return Reporte.criar(cabecalhoPdf, corpoPdf, rodapePdf, "PDF");
    }

}
