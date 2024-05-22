package src;

public class User {
    public static void main(String[] args) {
        Musica novamusica = new Musica();

        MusicaCommand playCommand = new PlayCommand(novamusica);
        MusicaCommand stopCommand = new StopCommand(novamusica);
        MusicaCommand goBackCommand = new GoBackCommand(novamusica);
        MusicaCommand goForwardCommand = new GoForwardCommand(novamusica);

        Control control = new Control();

        control.setMusicaCommand(playCommand);
        control.controlMusic();

        control.setMusicaCommand(stopCommand);
        control.controlMusic();

        control.setMusicaCommand(goBackCommand);
        control.controlMusic();

        control.setMusicaCommand(goForwardCommand);
        control.controlMusic();
    }
}
