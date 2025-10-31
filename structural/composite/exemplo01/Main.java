package structural.composite.exemplo01;

import structural.composite.exemplo01.classes.Arquivo;
import structural.composite.exemplo01.classes.Pasta;
import structural.composite.exemplo01.interfaces.ComponenteSistema;

public class Main {
    public static void main(String[] args) {
        ComponenteSistema arquivo1 = new Arquivo("Relatório_Q1.pdf");
        ComponenteSistema arquivo2 = new Arquivo("Foto_Ferias.jpg");
        ComponenteSistema arquivo3 = new Arquivo("Lista_Tarefas.txt");

        Pasta pastaDocumentos = new Pasta("Documentos");
        Pasta pastaProjetos = new Pasta("Projetos");

        pastaDocumentos.adicionar(arquivo1);
        pastaDocumentos.adicionar(arquivo3);

        Pasta pastaRaiz = new Pasta("Meu Computador");
        pastaRaiz.adicionar(pastaDocumentos);
        pastaRaiz.adicionar(pastaProjetos);
        pastaRaiz.adicionar(arquivo2);

        System.out.println("--- Estrutura do Sistema de Arquivos ---");
        pastaRaiz.exibirNome();
        System.out.println("----------------------------------------");
    }
}
