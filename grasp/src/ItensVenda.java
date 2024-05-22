package src;

public class ItensVenda {
    private String nome_iten;
    private int quantidade;

    public ItensVenda(String nome_produto, int quantidade) {
        this.nome_iten = nome_produto;
        this.quantidade = quantidade;
    }
    
    /*
     * ItnesVenda tem a responsabilidade de acordo com a regra Grasp
     * information expert, de calcular e retornar o valor total de um itens da venda
     */
    public double valor_total_itens(){
        Produto p = new Produto();
        double valor_produto = p.getPreco();
        double valor_final = valor_produto * quantidade;
        if (quantidade >= 100) {
            double desconto = valor_final * 0.1;
            valor_final = valor_final - desconto;
        }
        return valor_final;
    }

    public String getNome_iten() {
        return nome_iten;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
