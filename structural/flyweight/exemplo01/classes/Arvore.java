package structural.flyweight.exemplo01.classes;


// o objeto contexto: armazena os dados extrínsecos (únicos)
public class Arvore {
    private final int x;
    private final int y;
    // referência ao objeto Flyweight (cados compartilhados)
    private final TipoArvoreFlyweight tipo;

    public Arvore(int x, int y, TipoArvoreFlyweight tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    // delega a operação pesada para o Flyweight, passando o estado único (x, y)
    public void desenhar() {
        tipo.desenhar(x, y);
    }
}
