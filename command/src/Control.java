package src;

public class Control {
    private MusicaCommand musicaCommand;

    public void setMusicaCommand(MusicaCommand musicaCommand) {
        this.musicaCommand = musicaCommand;
    }

    public void controlMusic() {
        musicaCommand.execute();
    }
}
