package creational.factorymethod.exemplo01.classes;

import creational.factorymethod.exemplo01.interfaces.Transporte;

// Creator
public abstract class Logistica {

    // FACTORY METHOD: ele retorna a Interface/Produto
    // mas não sabe a classe concreta.
    // É abstrato, forçando as subclasses a implementarem.
    protected abstract Transporte criarTransporte();

    // O método principal que usa o objeto criado pelo Factory Method
    // Este método fica fechado para modificação, mesmo que novos transportes sejam criados.
    public String planejarEntrega() {
        Transporte t = criarTransporte();
        return "Planejamento concluído. " + t.entregar();
    }
}
