package br.com.meli.clientesapi.entity;

public class Produto {
    private long id;
    private String descricao;
    private String cor;
    private int quantidade;
    private double preco;

    public Produto(long id, String descricao, String cor, int quantidade, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // getters

    public long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCor() {
        return cor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
}
