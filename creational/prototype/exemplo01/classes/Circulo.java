package creational.prototype.exemplo01.classes;

public class Circulo extends FormaGeometrica {
    public int raio;

    // construtor padrão
    public Circulo() {}

    // Construtor de cópia: chama o construtor da classe base (super)
    // para copiar campos comuns (x, y, cor) e depois copia seus próprios campos (raio).
    public Circulo(Circulo fonte) {
        super(fonte);
        if (fonte != null) {
            this.raio = fonte.raio;
        }
    }

    // implementação do método de clonagem
    // cria uma nova instância chamando o construtor de cópia, passando a sim mesmo como fonte.
    @Override
    public FormaGeometrica clone() {
         return new Circulo(this);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando Círculo na posição ("+ x + ", " + y +") com raio " + raio + " e cor " + cor);
    }
}
