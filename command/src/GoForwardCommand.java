package src;

public class GoForwardCommand implements MusicaCommand{
    private  Musica musica;

    public GoForwardCommand(Musica musica) {
        this.musica = musica;
    }

    @Override
    public void execute() {
        musica.goForward();
    }
}
