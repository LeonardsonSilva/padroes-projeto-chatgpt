package behavioral.visitor.exemplo01.classes;

import behavioral.visitor.exemplo01.interfaces.Exportador;

public class ExportadorXML implements Exportador {

    @Override
    public String visitar(Circulo circulo) {
        return String.format("<Circulo raio=\"%d\"/>", circulo.raio);
    }

    @Override
    public String visitar(Retangulo retangulo) {
        return String.format("<Retangulo largura=\"%d\" altura=\"%d\"/>", retangulo.largura, retangulo.altura);
    }

}
