package src;

public class PlayCommand implements MusicaCommand{
    private  Musica musica;

    public PlayCommand(Musica musica) {
        this.musica = musica;
    }
    @Override
    public void execute() {
        musica.play();
    }
}
