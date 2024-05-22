package src;

public class StopCommand implements MusicaCommand{
    private  Musica musica;

    public StopCommand(Musica musica) {
        this.musica = musica;
    }
    @Override
    public void execute() {
        musica.stop();
    }
}
