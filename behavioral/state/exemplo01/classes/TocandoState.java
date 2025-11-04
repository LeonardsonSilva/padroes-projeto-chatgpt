package behavioral.state.exemplo01.classes;

import behavioral.state.exemplo01.interfaces.IPlayerState;


// estado concreto
/*
 * implementação do estado 'Tocando'.
 * Define o que acontece quando o Player estã em reprodução.
 */
public class TocandoState implements IPlayerState{

    @Override
    public void apertarPlay(MusicPlayer player) {
        // se já está tocandoe aperta Play, ignora ou reinicia a faixa
        System.out.println("|> Jà está tocando. Reiniciando a faixa");
    }

    @Override
    public void apertarPause(MusicPlayer player) {
        System.out.println("|| Pausando a reprodução. Música interrompida.");
        // muda o estado do contexto para "Pausado". Essa é a transição.
        player.setState(new PausadoState());
    }

    @Override
    public void apertarStop(MusicPlayer player) {
        System.out.println("[] Parando a reprodução. Voltando ao início.");
        // muda o estado do contexto para 'Parado'
        player.setState(new ParadoState());
    }

}
