package src;

public class Texto implements TipoMensagem{
    @Override
    public String formaMensagem(String conteudo) {
        return "Mensagem de Texto: " + conteudo;
    }
}
