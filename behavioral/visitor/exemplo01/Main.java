package behavioral.visitor.exemplo01;

import behavioral.visitor.exemplo01.classes.Circulo;
import behavioral.visitor.exemplo01.classes.ExportadorJSON;
import behavioral.visitor.exemplo01.classes.ExportadorXML;
import behavioral.visitor.exemplo01.classes.Retangulo;
import behavioral.visitor.exemplo01.interfaces.Exportador;
import behavioral.visitor.exemplo01.interfaces.FormaGeometrica;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[] {
            new Circulo(10),
            new Retangulo(5, 8)
        };

        Exportador jsonExportador = new ExportadorJSON();
        Exportador xmlExportador = new ExportadorXML();

        System.out.println("--- Exportando para JSON ---");
        for (FormaGeometrica forma : formas) {
            // o Elemento (forma) aceita o Visitante (jsonExportador)
            // e a operação é executada.
            String resultado = forma.aceitar(jsonExportador);
            System.out.println(resultado);
        }

        System.out.println("--- Exportando para XML ---");
        for (FormaGeometrica forma : formas) {
            // o Elemento (forma) aceita o Visitante (jsonExportador)
            // e a operação é executada.
            String resultado = forma.aceitar(xmlExportador);
            System.out.println(resultado);
        }
    }
}
