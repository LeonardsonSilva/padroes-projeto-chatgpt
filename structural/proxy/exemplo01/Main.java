package structural.proxy.exemplo01;

import structural.proxy.exemplo01.classes.ImagemProxy;
import structural.proxy.exemplo01.interfaces.Imagem;

public class Main {
    public static void main(String[] args) {
        // criando o proxy. A imagem real ainda não foi carregada.
        Imagem imagem1 = new ImagemProxy("foto_ferias.jpg");
        Imagem imagem2 = new ImagemProxy("grafico_relatorio.png");

        System.out.println("\n--- Cliente tentanto exibir a imagem 1 pela primeira vez ---");
        // o proxy detecta que o objeto real é null e o inicializa.
        imagem1.exibir();

        System.out.println("\n--- Cliente tentanto exibir a imagem 2 pela primeira vez ---");
        // novamente, o proxy inicializa o objeto real para a imagem 2
        imagem2.exibir();

        System.out.println("\n--- Cliente tentando exibir a imagem 1 pela segunda vez ---");
        // o objeto real já existe, o proxy apenas delega a chamada (rápido)
        imagem1.exibir();
    }
}
