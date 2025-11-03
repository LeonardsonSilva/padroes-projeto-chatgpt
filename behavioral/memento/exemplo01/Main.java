package behavioral.memento.exemplo01;

import behavioral.memento.exemplo01.classes.EditorDeTexto;
import behavioral.memento.exemplo01.classes.Historico;
import behavioral.memento.exemplo01.classes.TextoMemento;

public class Main {
    public static void main(String[] args) {
        // cria um editor (Originator) com o estado inicial
        EditorDeTexto editor = new EditorDeTexto("Início: ");
        // cria o histório (Caretaker) que vai guardar os "pontos de salvamento".
        Historico historico = new Historico();

        editor.escrever("Olá mundo. ");
        // salva o estado atual (Memento 1) e o Zelador (Histórico) o armazena.
        historico.adicionar(editor.salvar());

        editor.escrever("Este é o Padrão Memento. ");
        historico.adicionar(editor.salvar());

        editor.escrever("Vou cometer um erro aqui.");
        System.out.println("\n--- Estado atual antes de desfazer ---");
        System.out.println("Conteúdo final: \"" + editor.getConteudo() + "\"\n");

        // desfazer a ação anterior (escrever) (voltando ao memento 2)
        // o zelador (histórico) fornece o último Memento.
        TextoMemento memento2 = historico.getUltimo();
        if (memento2 != null) {
            // o Originator (Editor) usa o Memento para restaurar seu estado.
            editor.restaurar(memento2);
        }

        // voltando ao memento 1
        TextoMemento memento1 = historico.getUltimo();
        if (memento1 != null) {
            editor.restaurar(memento1);
        }

        System.out.println("\n--- Estado após restaurar duas vezes ---");
        System.out.println("Conteúdo Final e Correto: \"" + editor.getConteudo() + "\"");



    }
}
