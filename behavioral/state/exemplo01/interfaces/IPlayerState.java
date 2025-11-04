package behavioral.state.exemplo01.interfaces;

import behavioral.state.exemplo01.classes.MusicPlayer;

// interface de Estado
// Interface que define o conjunto de operações que podem ser realizadas
// em qualquer estado do Player
public interface IPlayerState {
    // o 'contexto' (MusicPlayer) é passado para que o estado possa
    // chamar métodos do contexto ou mudar o estado do contexto
    void apertarPlay(MusicPlayer player);
    void apertarPause(MusicPlayer player);
    void apertarStop(MusicPlayer player);
}
