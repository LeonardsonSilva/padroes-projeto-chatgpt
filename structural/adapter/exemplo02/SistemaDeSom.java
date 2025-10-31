package structural.adapter.exemplo02;

import structural.adapter.exemplo02.classes.TocadorMP3Adapter;
import structural.adapter.exemplo02.classes.TocadorMP3Antigo;
import structural.adapter.exemplo02.classes.TocadorPadrao;
import structural.adapter.exemplo02.interfaces.TocadorDeMusica;

public class SistemaDeSom {
    public static void main(String[] args) {
        System.out.println("--- Cenário 1: uso normal ---");
        // uma classe "normal" que implementa TocadorDeMusica
        TocadorDeMusica tocadorPadrao = new TocadorPadrao();
        tocadorPadrao.tocar("musica_pop.wav");  // chama o método esperado

        System.out.println("\n--- Cenário 2: uso do Adaptee com Adapter ---");
        // criação do Adaptee (o objeto incompatível)
        TocadorMP3Antigo tocadorMP3Legado = new TocadorMP3Antigo();
        // criação do adapter
        // o adapter se encaixa na interface Target e encapsula o Adaptee
        TocadorDeMusica adaptador = new TocadorMP3Adapter(tocadorMP3Legado);

        // o cliente (SistemDeSom) chama o Adapter exatamente como se fosse o target "normal"
        // ele não sabe que uma conversão está acontecendo.
        adaptador.tocar("musica_rock.mp3");
        //


    }
}
