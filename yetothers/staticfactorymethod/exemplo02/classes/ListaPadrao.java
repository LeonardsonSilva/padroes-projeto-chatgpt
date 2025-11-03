package yetothers.staticfactorymethod.exemplo02.classes;

import yetothers.staticfactorymethod.exemplo02.interfaces.ListaImutavel;


// produto concreto (implementação padrão para vários elementos)
public class ListaPadrao<T> implements ListaImutavel<T> {

    private final T[] elementos;

    public ListaPadrao(T... elementos) {
        this.elementos = elementos;
    }

    @Override
    public T get(int index) {
        return elementos[index];
    }

    @Override
    public int size() {
        return elementos.length;
    }

    @Override
    public String descricao() {
        return "Lista PADRÃO (Array Interno)";
    }

}
