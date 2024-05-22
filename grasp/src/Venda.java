package src;

import java.util.ArrayList;
import java.util.HashMap;

public class Venda {
    private HashMap<String, ItensVenda> vendas;
    private ArrayList<Pagamento> pagamentos;

    /*
     * Venda cria Itens venda pois de acordo com a regra GRASP
     * o criador deve ser aquele que armazena ou manipula objetos
     * da classe a ser criada, como em venda tem um hashmap de itens
     * ele deve criá-la.
     */
    public void criarItensVenda(String id_venda, String nome_iten, int quantidade) {
        ItensVenda iv = new ItensVenda(nome_iten, quantidade);
        vendas.put(id_venda, iv);
    }

    /*
     * Venda tem a responsabilidade de acordo com a regra Grasp
     * information expert, de calcular e retornar o valor total 
     * de uma venda
     */
    public double valor_total_venda(String nome_venda){
        ItensVenda iv = vendas.get(nome_venda);
        double preco = iv.valor_total_itens();
        return preco;
    }
    /*
     * Venda tem a responsabilidade de acordo com a regra Grasp
     * information expert, de realizar o pagamento
     */
    public void realizar_pagamento(String id_venda){
        Pagamento p = new Pagamento(id_venda);
        pagamentos.add(p);
    }
}