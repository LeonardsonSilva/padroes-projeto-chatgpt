package structural.proxy.exemplo01.classes;

import structural.proxy.exemplo01.interfaces.Imagem;

public class ImagemProxy implements Imagem {
    private String nomeArquivo;
    private ImagemReal imagemReal; // Referência ao objeto real

    // o proxy é criado rapidamente
    public ImagemProxy(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        System.out.println("Referência do proxy para '" + nomeArquivo + "' criada (sem carregar ainda).");
    }

    @Override
    public void exibir() {
        // a lógica do proxy acontece aqui
        // se o objeto real ainda não foi criado, é hora de criá-lo! (lazy initialization / Proxy Virtual)
        if (imagemReal == null) {
            System.out.println("\n Método 'exibir chamado. Inicializando a Imagem Real agora...");
            imagemReal = new ImagemReal(nomeArquivo);
        }

        // agora, o proxy delega a chamada para o objeto real
        imagemReal.exibir();

    }

}
