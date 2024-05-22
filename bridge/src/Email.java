package src;

public class Email extends MnSG {
    private String destinatario;
    public Email(TipoMensagem tipoMensagem, String destinatario) {
        super(tipoMensagem);
        this.destinatario = destinatario;
    }

    public String enviaMensagem(String conteudo) {
        String mensagem = geraMensagem(conteudo);
        return "Email para: " + this.destinatario + "\n" + mensagem;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }
}
