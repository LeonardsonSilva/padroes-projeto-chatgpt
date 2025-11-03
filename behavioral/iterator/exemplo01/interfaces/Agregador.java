package behavioral.iterator.exemplo01.interfaces;

// interface da coleção
public interface Agregador<T> {
    Iterator<T> criarIterator();
}
