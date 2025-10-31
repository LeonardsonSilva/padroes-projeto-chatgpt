package creational.prototype.exemplo01.classes;

public abstract class FormaGeometrica implements Cloneable {
    public int x;
    public int y;
    public String cor;

    // construtor padrão (pode ser custoso, mas só será chamada uma vez no protótipo)
    public FormaGeometrica() {}

    // Construtor de cópia (fundamental para o Prototype)
    // Ele aceita um objeto da própria classe como argumento e copia seus valores.
    public FormaGeometrica(FormaGeometrica fonte) {
        if (fonte != null) {
            this.x = fonte.x;
            this.y = fonte.y;
            this.cor = fonte.cor;
        }
    }

    // O método principal do padrão prototype
    // ele é responsável por criar e retornar uma cópia do objeto atual.
    public abstract FormaGeometrica clone();

    // método para demonstração
    public abstract void desenhar();
}
