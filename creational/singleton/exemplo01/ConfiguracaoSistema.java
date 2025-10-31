package creational.singleton.exemplo01;


public class ConfiguracaoSistema {
    // atributo estático e privado para guardar a única instância.
    // o 'static' significa que pertence à classe, não ao objeto.
    // o 'private' impede acesso e modificação diretos de fora.
    private static ConfiguracaoSistema instanciaUnica;

    private String tema = "claro";
    private int limiteUsuarios = 50;

    // construtor privado.
    // impede que outras classes criem instâncias usando 'new'
    private ConfiguracaoSistema() {
        // simula uma inicialização "pesada" ou complexa (carregar arquivo, etc).
        System.out.println("Configurações do sistema carregadas! (Executado apenas uma vez)");
    }

    // métod estático e público para obter a única instância
    // este é o ponto de acesso global
    public static ConfiguracaoSistema getInstance() {
        // lógica de Inicialização Lenta (Lazy Initialization)
        // verifica se a instância ainda não foi criada.
        if (instanciaUnica == null) {
            // se for a primeira vez (instanciaUnica é null)
            // cria a única instância
            instanciaUnica = new ConfiguracaoSistema();
        }
        // retorna a instância única, seja ela recém-criada ou a existente.
        return instanciaUnica;
    }

    public String getTema() {
        return tema;
    }
    public void setTema(String novoTema) {
        this.tema = novoTema;
    }
    public int getLimiteUsuarios() {
        return limiteUsuarios;
    }
    // método de teste para mostrar que a instância é a mesma
    public void mostrarHash() {
        System.out.println("Hash da Instância: " + this.hashCode());
    }
}
