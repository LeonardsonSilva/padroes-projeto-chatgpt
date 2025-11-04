package behavioral.visitor.exemplo01.classes;

import behavioral.visitor.exemplo01.interfaces.Exportador;

public class ExportadorJSON implements Exportador {

    @Override
    public String visitar(Circulo c) {
        return String.format("{\n  \"tipo\": \"circulo\",\n  \"raio\": %d\n}", c.raio);
    }

    @Override
    public String visitar(Retangulo r) {
        return String.format("{\n  \"tipo\": \"retangulo\",\n  \"largura\": %d,\n  \"altura\": %d\n}", r.largura, r.altura);
    }

}
