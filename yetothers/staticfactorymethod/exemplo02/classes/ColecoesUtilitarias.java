package yetothers.staticfactorymethod.exemplo02.classes;

import yetothers.staticfactorymethod.exemplo02.interfaces.ListaImutavel;

public class ColecoesUtilitarias {

    // instância singleton da lista vazia para reutilização (otimização)
    private static final ListaImutavel<?> LISTA_VAZIA_CACHE = new ListaVazia<>();

    // O static factory method: decide a classe concreta a ser instanciada
    public static <T> ListaImutavel<T> of(T... elementos) {
        if (elementos == null || elementos.length == 0) {
            System.out.println("[FÁBRICA] -> Retornando Lista Vazia cacheada.");
            return (ListaImutavel<T>) LISTA_VAZIA_CACHE;
        } else if (elementos.length == 1) {
            System.out.println("[FÁBRICA] Retornando Lista ÚNICA otimizada.");
            return new ListaUnica<>(elementos[0]);
        } else {
            System.out.println("[FÁBRICA] -> Retornando Lista PADRÃO.");
            return new ListaPadrao<>(elementos);
        }
    }
}
