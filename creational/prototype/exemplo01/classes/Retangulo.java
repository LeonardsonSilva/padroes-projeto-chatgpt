package creational.prototype.exemplo01.classes;

public class Retangulo extends FormaGeometrica {
    public int largura;
    public int altura;

    // construtor padrão
    public Retangulo() {}

    // Construtor de cópia: chama o construtor da classe base (super)
    // para copiar campos comuns (x, y, cor) e depois copia seus próprios campos (raio).
    public Retangulo(Retangulo fonte) {
        super(fonte);
        if (fonte != null) {
            this.largura = fonte.largura;
            this.altura = fonte.altura;
        }
    }

    // implementação do método de clonagem
    // cria uma nova instância chamando o construtor de cópia, passando a sim mesmo como fonte.
    @Override
    public FormaGeometrica clone() {
         return new Retangulo(this);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando Retangulo na posição ("+ x + ", " + y +") com " + largura + "x" + altura + " e cor " + cor);
    }
}
