package yetothers.staticfactorymethod.exemplo01.classes;

public class Cor {
    private final int r;
    private final int g;
    private final int b;

    private Cor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format("Cor [R=%d, G=%d, B=%d]", r, g, b);
    }

    // Static Factory Methods (Métodos de Fábrica Estáticos)
    public static Cor criarAPartirRGB(int r, int g, int b) {
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
            throw new IllegalArgumentException("Valores RGB devem estar entre 0 e 255.");
        }
        return new Cor(r, g, b);
    }

    public static Cor criarAPartirHex(String hex) {
        // lógica de conversão hex -> RGB (simplificada para exemplo)
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }
        if (hex.length() != 6) {
            throw new IllegalArgumentException("Hexadeximal inválido.");
        }

        // simulação de conversão #ff0000 (vermelho puro)
        if (hex.equalsIgnoreCase("FF0000")) {
            return new Cor(255, 0, 0);
        }

        return new Cor(0, 0, 0);
    }

    private static final Cor PRETA = new Cor(0, 0, 0);

    // retornando instância única (otimização de recurso)
    // se precisarmos de uma instância "preta" que será usada o tempo todo.
    public static Cor getCorPreta() {
        // não cria um novo objeto, retorna uma instância cacheada (singleton)
        return PRETA;
    }
}
