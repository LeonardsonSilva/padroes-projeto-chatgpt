package behavioral.visitor.exemplo01.classes;

import behavioral.visitor.exemplo01.interfaces.Exportador;
import behavioral.visitor.exemplo01.interfaces.FormaGeometrica;


// Eles apenas implementam o 'aceitar' chamando o método de visita correto no
// Visitante, passando a si mesmos (this)
public class Retangulo implements FormaGeometrica {
    public int largura;
    public int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String aceitar(Exportador exportador) {
        return exportador.visitar(this);
    }

}
