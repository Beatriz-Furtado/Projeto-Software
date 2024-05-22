package src;

public class Imagem implements TipoMensagem{
    @Override
    public String formaMensagem(String conteudo) {
        return "Imagem anexada: " + conteudo;
    }
}
