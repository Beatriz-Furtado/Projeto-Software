package src;

public class GoBackCommand implements MusicaCommand{
    private  Musica musica;

    public GoBackCommand(Musica musica) {
        this.musica = musica;
    }

    @Override
    public void execute() {
        musica.goBack();
    }
}
