package src;

public class Credito extends PagamentoService{
    @Override
    public void checandoSaldo() {
        System.out.println("Checando limite de crédito do usurário");
    }

    @Override
    public double realizandoPagamento(double valor) {
        double valorFinal = valor * 1.1;
        System.out.println("Realizando pagamento via cartão de crédito. Valor da compra = " + valorFinal);
        return valorFinal;
    }

    @Override
    public void ultimasAcoes() {
        System.out.println("Realizando atualização do limite de crédito.");
    }
}
