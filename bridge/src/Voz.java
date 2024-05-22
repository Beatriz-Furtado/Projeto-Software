package src;

public class Voz implements TipoMensagem{
    @Override
    public String formaMensagem(String conteudo) {
        return "Mensagem de voz: " + conteudo;
    }
}
