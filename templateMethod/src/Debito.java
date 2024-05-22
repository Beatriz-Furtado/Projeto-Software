package src;

public class Debito extends PagamentoService{
    @Override
    public void checandoSaldo() {
        System.out.println("Checando saldo da conta do usurário.");
    }

    @Override
    public double realizandoPagamento(double valor) {
        System.out.println("Realizando pagamento via cartão de débito. Valor da compra = " + valor);
        return valor;
    }

    @Override
    public void ultimasAcoes() {
        System.out.println("Realizando atualização do saldo da conta.");
    }
}
