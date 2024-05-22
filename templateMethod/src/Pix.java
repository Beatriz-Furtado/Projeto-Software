package src;

public class Pix extends PagamentoService{
    @Override
    public void checandoSaldo() {
        System.out.println("Checando chave PIX do destinatário.");
    }

    @Override
    public double realizandoPagamento(double valor) {
        double valorFinal = valor * 0.9;
        System.out.println("Realizando pagamento via PIX. Valor da compra = " + valorFinal);
        return valorFinal;
    }

    @Override
    public void ultimasAcoes() {
        System.out.println("Realizando atualização do saldo da conta.");
    }
}
