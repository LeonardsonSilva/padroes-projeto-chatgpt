package structural.proxy.exemplo01.classes;

import structural.proxy.exemplo01.interfaces.Imagem;

// objeto real (o "peso pesado")
public class ImagemReal implements Imagem {
    private String nomeArquivo;

    // o construtor é onde o carregamento pesado acontece
    public ImagemReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarDoDisco(); // o método demorado
    }

    private void carregarDoDisco() {
        System.out.println("⏳ Carregando imagem pesada: " + nomeArquivo + "...");
        try {
            // simula um carregamento de arquivo demorado
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("✅ Imagem " + nomeArquivo + " carregada com sucesso.");
    }

    @Override
    public void exibir() {
        System.out.println("🖼️ Exibindo imagem: " + nomeArquivo);
    }

}
