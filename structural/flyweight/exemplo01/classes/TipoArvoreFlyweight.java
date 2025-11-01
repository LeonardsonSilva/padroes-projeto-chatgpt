package structural.flyweight.exemplo01.classes;


// o objeto Flyweight: armazena os dados intrínsecos (compartilhados)
public class TipoArvoreFlyweight {
    private final String nome;
    private final String cor;
    private final String textura;

    public TipoArvoreFlyweight(String nome, String cor, String textura) {
        System.out.println("Criando tipo de árvore: " + nome);
        this.nome = nome;
        this.cor = cor;
        this.textura = textura;
    }

    public void desenhar(int x, int y) {
        System.out.println("Desenhando Árvore " + nome +
                            " (Cor: " + cor + ", Textura: " + textura +
                            ") na posição (" + x + ", "+ y +")");
    }
}
