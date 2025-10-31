package structural.adapter.exemplo02.classes;

import structural.adapter.exemplo02.interfaces.TocadorDeMusica;

public class TocadorMP3Adapter implements TocadorDeMusica {

    // campo para guardar uma referência ao objeto Adaptee (composição)
    private TocadorMP3Antigo tocadorAntigo;

    // O Adaptador recebe o Adaptee em seu construtor
    public TocadorMP3Adapter(TocadorMP3Antigo tocadorAntigo) {
        this.tocadorAntigo = tocadorAntigo;
    }

    // Implementação do método Target (TocadorDeMusica)
    @Override
    public void tocar(String nomeDoArquivo) {
        // Aqui acontece a adaptação
        // O Adapter traduz a chamada do Cliente (tocar) para a chamada do Adaptee (reproduzirMp3).
        // Ele também preenche o parâmetro de 'volume' que o Cliente não forneceu;
        int volumePadrao = 5;
        tocadorAntigo.reproduzirMp3(nomeDoArquivo, volumePadrao);
    }

}
