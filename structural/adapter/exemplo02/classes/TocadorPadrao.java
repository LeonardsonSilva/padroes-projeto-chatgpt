package structural.adapter.exemplo02.classes;

import structural.adapter.exemplo02.interfaces.TocadorDeMusica;


// apenas uma classe auxiliar para simular uma implementação normal do Target
public class TocadorPadrao implements TocadorDeMusica {

    @Override
    public void tocar(String nomeDoArquivo) {
        System.out.println("Tocador Padrão: Tocando arquivo: " + nomeDoArquivo);
    }

}
