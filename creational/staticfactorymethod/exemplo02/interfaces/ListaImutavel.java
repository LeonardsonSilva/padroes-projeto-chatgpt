package creational.staticfactorymethod.exemplo02.interfaces;


// produto
public interface ListaImutavel<T> {
    T get(int index);
    int size();
    String descricao();
}
