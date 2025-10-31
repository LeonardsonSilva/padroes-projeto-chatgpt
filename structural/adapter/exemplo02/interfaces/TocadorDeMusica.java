package structural.adapter.exemplo02.interfaces;


// target: interface que o cliente (sistema de som) espera
public interface TocadorDeMusica {

    // o cliente espera um método simples para tocar um arquivo
    void tocar(String nomeDoArquivo);
}
