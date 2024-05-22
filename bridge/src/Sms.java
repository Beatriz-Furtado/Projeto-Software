package src;

public class Sms extends MnSG {
    private String destinatario;
    public Sms(TipoMensagem tipoMensagem, String destinatario) {
        super(tipoMensagem);
        this.destinatario = destinatario;
    }

    public String enviaMensagem(String conteudo) {
        String mensagem = geraMensagem(conteudo);
        return "Sms para: " + this.destinatario + "\n" + mensagem;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }
}
