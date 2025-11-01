package structural.flyweight.exemplo01.classes;

import java.util.HashMap;
import java.util.Map;

// a fábrica: garante que o objeto seja criado apenas se ainda não existir
public class FabricaTipoArvore {
    // o pool (ou cache) do Flyweight
    private static final Map<String, TipoArvoreFlyweight> flyweights = new HashMap<>();

    // o método chave: retorna um objeto Flyweight existente ou cria um novo
    public static TipoArvoreFlyweight getTipoArvore(String nome, String cor, String textura) {
        // se o tipo de árvore não existe no pool, cria um novo
        if (!flyweights.containsKey(nome)) {
            TipoArvoreFlyweight novoTipo = new TipoArvoreFlyweight(nome, cor, textura);
            flyweights.put(nome, novoTipo);
        }
        // retorna a instância compartilhada (existente ou recém-criada)
        return flyweights.get(nome);
    }
}
