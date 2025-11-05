package creational.builder.exemplo03.classes;

import creational.builder.exemplo03.interfaces.ReporteBuilder;

// o Director sabe a sequência correta de passos, mas não se importa com a forma como os
// passos são implementados (PDF, HTML etc)
public class ReporteDirector {
    public void construirRelatorioPadrao(ReporteBuilder builder, String titulo, String autor, String conteudo, String dataGeracao) {
        builder.construirCabecalho(titulo, autor);
        builder.construirCorpo(conteudo);
        builder.construirRodape(dataGeracao);
        // nota: o Director não chama getResultado(), apenas orquesta a construção
    }

}
