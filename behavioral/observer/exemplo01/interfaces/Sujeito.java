package behavioral.observer.exemplo01.interfaces;


// Define o contrato para o objeto que contém os dados e que notifica
public interface Sujeito {
    void anexar(Observador observador);
    void desanexar(Observador observador);
    void notificarObservadores();
}
