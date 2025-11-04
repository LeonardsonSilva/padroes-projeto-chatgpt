package behavioral.visitor.exemplo01.classes;

import behavioral.visitor.exemplo01.interfaces.Exportador;
import behavioral.visitor.exemplo01.interfaces.FormaGeometrica;


// Eles apenas implementam o 'aceitar' chamando o método de visita correto no
// Visitante, passando a si mesmos (this)
public class Circulo implements FormaGeometrica {
    public int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public String aceitar(Exportador exportador) {
        // Isso é a Dupla Distribuição (Double Dispatch) simulada em Java:
        // 1. o aceitar() é despachado (polimorfismo do lado do Elemento).
        // 2. o visitar(Circulo) é despachado (polimorfismo do lado do Visitante).
        return exportador.visitar(this);
    }

}
