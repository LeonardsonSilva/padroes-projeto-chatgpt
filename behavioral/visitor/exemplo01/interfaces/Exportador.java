package behavioral.visitor.exemplo01.interfaces;

import behavioral.visitor.exemplo01.classes.Circulo;
import behavioral.visitor.exemplo01.classes.Retangulo;

// interface visitante (Visitor)
// define os métodos de visita para cad tipo de elemento
public interface Exportador {
    // sobrecarga de método (method overloading) que permite ao Visitante
    // executar a lógica correta baseada no tipo exato de Elemento
    String visitar(Circulo circulo);
    String visitar(Retangulo retangulo);
    // adicionar um novo Elemento exige adicionar um novo 'visitar()' aqui.
}
