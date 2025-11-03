package behavioral.memento.exemplo01.classes;


// o Originator: objeto cujo estado queremos salvar e restaurar
public class EditorDeTexto {
    private String conteudo;

    public EditorDeTexto(String conteudoInicial) {
        this.conteudo = conteudoInicial;
    }

    // método para alterar o estado do Originator (escrever no editor)
    public void escrever(String texto) {
        conteudo += texto;
        System.out.println("-> Editor: Conteúdo atualizado: \"" + conteudo + "\"");
    }

    // Métodos memento: o originator cria e restaura o Memento

    // cira um memento, salvando seu estado interno atual
    public TextoMemento salvar() {
        System.out.println("Originator: salvando estado...");
        // o Originator é o único que sabe o que precisa ser salvo
         return new TextoMemento(conteudo);
    }

    // restaura o estado interno a partir do Memento fornecido.
    public void restaurar(TextoMemento memento) {
        // o Originator é o único que sabe como usar os dados do Memento
        this.conteudo = memento.getConteudoSalvo();
        System.out.println("Originator: estado restaurado. Conteúdo atual: \"" + conteudo + "\"");
    }

    // método auxiliar para ver o estado atual
    public String getConteudo() {
        return conteudo;
    }
}
