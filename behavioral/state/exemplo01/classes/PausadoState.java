package behavioral.state.exemplo01.classes;

import behavioral.state.exemplo01.interfaces.IPlayerState;


// implementação do estado 'Pausado'
public class PausadoState implements IPlayerState{

    @Override
    public void apertarPlay(MusicPlayer player) {
        System.out.println("|> Retomando a reprodução. Música voltando de onde parou.");
        // de pausado, a transição natural é para Tocando
        player.setState(new TocandoState());
    }

    @Override
    public void apertarPause(MusicPlayer player) {
        System.out.println("|| Já está pausado. Aperte Play para retomar.");
    }

    @Override
    public void apertarStop(MusicPlayer player) {
        System.out.println("[] Parando a reprodução. Voltando ao início.");
        player.setState(new ParadoState());
    }

}
