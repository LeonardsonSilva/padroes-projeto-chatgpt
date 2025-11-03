package behavioral.memento.exemplo01.classes;

import java.util.ArrayList;
import java.util.List;

// O Caretaker (Zelador): objeto que armazena e gerencia os Mementos
public class Historico {
    // lista para armazenar todos os Mementos (os "pontos de salvamento").
    private final List<TextoMemento> mementos = new ArrayList<>();

    // adiciona um memento à lista (guarda um ponto de salvamento)
    public void adicionar(TextoMemento memento) {
        mementos.add(memento);
        System.out.println("Histórico: Mememnto adicionado ao Histórico.");
    }

    // retorna o memento mais recente (o último estado salvo para o Desfazer)
    // geralmente em um histórico "undo/redo" usuaria uma pilha (Stack)
    public TextoMemento getUltimo() {
        if (mementos.isEmpty()) {
            return null;
        }
        // remove e retorna o último (simulando um "pop" de pilha, para desfazer a última ação)
        int ultimoIndice = mementos.size() - 1;
        TextoMemento ultimoMemento = mementos.get(ultimoIndice);
        mementos.remove(ultimoIndice);  // remove para que a ação "desfeita" não seja repetida imediatamente.
        return ultimoMemento;
    }
}
