package behavioral.state.exemplo01.classes;

import behavioral.state.exemplo01.interfaces.IPlayerState;


// implementação do estado 'Parado'
public class ParadoState implements IPlayerState{

    @Override
    public void apertarPlay(MusicPlayer player) {
        System.out.println("|> Iniciando a reprodução da faixa 1.");
        // De parado, a transição natural é para Tocando.
        player.setState(new TocandoState());
    }

    @Override
    public void apertarPause(MusicPlayer player) {
        System.out.println("|| O Player já está parado. Não é possível pausar.");
    }

    @Override
    public void apertarStop(MusicPlayer player) {
        System.out.println("[] O Player já está parado.");
    }

}
