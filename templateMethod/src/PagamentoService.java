package src;

public abstract class PagamentoService {
    private double valorFinal;

    public double processarPagamento(String metodoDePagamento, double valor) {
        if(!"DEBITO".equals(metodoDePagamento) && !"CREDITO".equals(metodoDePagamento) &&
                !"PIX".equals(metodoDePagamento) && !"BOLETO".equals(metodoDePagamento)) {
            throw new IllegalArgumentException("Metodo de pagamento invalido: " + metodoDePagamento);
        }
        checandoSaldo();
        realizandoVerificacoes();
        this.valorFinal = realizandoPagamento(valor);
        ultimasAcoes();
        compraConcluida();

        return valorFinal;
    }
    public abstract void checandoSaldo();

    public void realizandoVerificacoes() {
        System.out.println("Realizando verificações de segurança.");
    }

    public abstract double realizandoPagamento(double valor);

    public abstract void ultimasAcoes();

    public void compraConcluida() {
        System.out.println("Notifica compra concluída.");
    }
}
