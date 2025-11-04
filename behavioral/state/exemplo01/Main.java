package behavioral.state.exemplo01;

import behavioral.state.exemplo01.classes.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.play();
        player.pause();
        player.play();
        player.play();
        player.stop();
        player.pause();

    }
}
