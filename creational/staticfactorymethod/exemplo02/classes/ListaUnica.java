package creational.staticfactorymethod.exemplo02.classes;

import creational.staticfactorymethod.exemplo02.interfaces.ListaImutavel;


// produto concreto (otimizada para um único elemento)
public class ListaUnica<T> implements ListaImutavel<T> {

    private final T elemento;

    public ListaUnica(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public T get(int index) {
        if (index == 0) return elemento;
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public String descricao() {
        return "Lista ÚNICA (Classe Especializada)";
    }

}
