package br.com.meli.clientesapi.entity;

import java.util.List;

public class Pedido {

    private long id;
    private List<Produto> produtos;
    private double valorTotal;

    public Pedido(long id, List<Produto> produtos) {
        this.id = id;
        this.produtos = produtos;
    }

    // getters
    public long getId() {
        return id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        this.valorTotal = produtos.stream().mapToDouble(produto -> produto.getPreco()*produto.getQuantidade()).sum();
        return valorTotal;
    }
}
