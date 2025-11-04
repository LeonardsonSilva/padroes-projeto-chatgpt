package behavioral.visitor.exemplo01.interfaces;


// Iterface Elemento (Element)
// deve ser 'visitável'
public interface FormaGeometrica {
    // o Elemento 'aceita' o visitante. O Visitante é quem fará a operação.
    String aceitar(Exportador exportador);
}
