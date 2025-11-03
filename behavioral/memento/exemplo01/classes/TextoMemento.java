package behavioral.memento.exemplo01.classes;


// o Memento: objeto que armazena o estado do Originator.
// note que ele é privado para o Originator, pois só tem métodos get/set parao Originator
public class TextoMemento {
    // estado interno do Originator que queremos salvar
    private final String conteudo;

    // o construtor é usado pelo Originator para salvar o estado
    public TextoMemento(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudoSalvo() {
        return conteudo;
    }
}
