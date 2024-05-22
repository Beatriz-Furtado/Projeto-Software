package src;

public class Boleto extends PagamentoService{
    @Override
    public void checandoSaldo() {
        System.out.println("Checando chave Boleto do destinatário.");
    }

    @Override
    public double realizandoPagamento(double valor) {
        double valorFinal = valor * 0.95;
        System.out.println("Realizando pagamento via Boleto. Valor da compra = " + valorFinal);
        return valorFinal;
    }

    @Override
    public void ultimasAcoes() {
        System.out.println("Realizando agendamento para atualização do saldo.");
    }
}
