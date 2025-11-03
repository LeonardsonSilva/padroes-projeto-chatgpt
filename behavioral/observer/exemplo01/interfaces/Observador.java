package behavioral.observer.exemplo01.interfaces;

// define o contrato para todos os observadores (o assinante)
// todos os objetos que querem ser notificados devem implementar isso.
public interface Observador {
    void atualizar(double novoPreco);
}
