package behavioral.state.exemplo01.classes;

import behavioral.state.exemplo01.interfaces.IPlayerState;


// contexto
/*
 * Mantém a referência ao estado atual e
 * é a interface que os clientes (usuários) utilizam.
 */
public class MusicPlayer {
    private IPlayerState currentState;

    public MusicPlayer() {
        // estado inicial do player
        this.currentState = new ParadoState();
        System.out.println("Player iniciado. Estado inicial: PARADO.");
    }

    /*
     * método setter para mudar o estado interno.
     * Usado pelas classes de estado para fazer a transição.
     */
    public void setState(IPlayerState newState) {
        this.currentState = newState;
    }

    // métodos expostos ao cliente. Eles delegam a ação ao objeto de estado.
    public void play() {
        currentState.apertarPlay(this);
    }

    public void pause() {
        currentState.apertarPause(this);
    }

    public void stop() {
        currentState.apertarStop(this);
    }


}
