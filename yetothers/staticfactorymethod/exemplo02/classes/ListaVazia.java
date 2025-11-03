package yetothers.staticfactorymethod.exemplo02.classes;

import yetothers.staticfactorymethod.exemplo02.interfaces.ListaImutavel;


// produto concreto (otimizada para zero elementos (singleton))
public class ListaVazia<T> implements ListaImutavel<T> {

    @Override
    public T get(int index) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String descricao() {
        return "Lista VAZIA (Singleton - Otimizada)";
    }

}
