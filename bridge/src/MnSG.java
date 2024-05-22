package src;

public class MnSG {
    protected TipoMensagem tipoMensagem;

    public MnSG(TipoMensagem tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public String geraMensagem(String conteudo) {
        return tipoMensagem.formaMensagem(conteudo);
    }

    public void setTipoMensagem(TipoMensagem tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }
}
