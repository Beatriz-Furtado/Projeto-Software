package src;

public class Slack extends MnSG {
    private String destinatario;
    public Slack(TipoMensagem tipoMensagem, String destinatario) {
        super(tipoMensagem);
        this.destinatario = destinatario;
    }

    public String enviaMensagem(String conteudo) {
        String mensagem = geraMensagem(conteudo);
        return "Slack para: " + this.destinatario + "\n" + mensagem;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }
}
