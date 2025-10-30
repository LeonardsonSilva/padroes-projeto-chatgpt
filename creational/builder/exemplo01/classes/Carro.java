package creational.builder.exemplo01.classes;


// O Objeto complexo que queremos construir
// É bom que seja imutável, por isso não tem setters
public class Carro {
    private final String motor;
    private final String cor;
    private final Boolean temGPS;
    private final Boolean temTetoSolar;

    // construtor privado. A única forma de criar um Carro é
    // passando o objeto Builder já configurado.
    private Carro(CarroBuilder builder) {
        this.motor = builder.motor;
        this.cor = builder.cor;
        this.temGPS = builder.temGPS;
        this.temTetoSolar = builder.temTetoSolar;
    }

    @Override
    public String toString() {
        return "Carro [Motor=" + motor +
            ", Cor=" + cor +
            ", GPS=" + (temGPS ? "Sim" : "Não") +
            ", TetoSolar=" + (temTetoSolar ? "Sim" : "Não") +
            "]";
    }

    // A classe Builder (geralmente aninhada para facilitar o acesso)
    // é o "formulário de pedido". Ele detém a responsabilidade de montar os atributos
    public static class CarroBuilder {
        // atributos obrigatórios (aqui definido no construtor do Builder)
        private final String motor;

        // Atributos opcionais (com valores padrão)
        private String cor = "Preto";
        private Boolean temGPS = false;
        private Boolean temTetoSolar = false;

        // o Builder precisa de atributos mínimos para começar a construção
        public CarroBuilder(String motor) {
            this.motor = motor;
        }

        // métodos de configuração (passos de construção)
        // O crucial é que eles retornam o próprio builder (this)
        // Isso permite o encadeamento de chamadas (fluent interface)
        public CarroBuilder comCor(String cor) {
            this.cor = cor;
            return this;  // retorna o Builder para continuar a configuração
        }

        public CarroBuilder comGPS() {
            this.temGPS = true;
            return this;  // retorna o Builder
        }

        public CarroBuilder comTetoSolar() {
            this.temTetoSolar = true;
            return this;  // retorna o Builder
        }

        // O método final de construção
        // Ele chama o construtor privado da classe Carro, passando a sim mesmo, o objeto Builder construído.
        public Carro build() {
            return new Carro(this);
        }
    }
}
