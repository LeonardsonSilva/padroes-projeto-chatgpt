package creational.builder.exemplo03.classes;

import creational.builder.exemplo03.interfaces.ReporteBuilder;


public class HtmlReporteBuilder implements ReporteBuilder {
    private String cabecalhoHtml;
    private String corpoHtml;
    private String rodapeHtml;

    @Override
    public void construirCabecalho(String titulo, String autor) {
        // Formatação específica para HTML (usando tags HTML)
        this.cabecalhoHtml = "<h1>" + titulo + "</h1>\n<p><i>Por: " + autor + "</i></p>";
    }

    @Override
    public void construirCorpo(String conteudo) {
        // Conteúdo formatado como parágrafos HTML
        this.corpoHtml = "<div class='content'>\n" + conteudo.replaceAll("\\.", ".</p><p>") + "</div>";
    }

    @Override
    public void construirRodape(String dataGeracao) {
        this.rodapeHtml = "<hr/>\n<small>Data: " + dataGeracao + "</small>";
    }

    @Override
    public Reporte getResultado() {
        return Reporte.criar(cabecalhoHtml, corpoHtml, rodapeHtml, "HTML");
    }
}
