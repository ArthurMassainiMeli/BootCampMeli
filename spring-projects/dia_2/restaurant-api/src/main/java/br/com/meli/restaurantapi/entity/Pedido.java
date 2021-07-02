package br.com.meli.restaurantapi.entity;

import java.util.*;

public class Pedido {
    private int id;
    private int mesa;
    private List<Prato> listaDePratos;
    private double valorTotaldoPedido;

    public Pedido(int id, int mesa, List<Prato> listaDePratos) {
        this.id = id;
        this.mesa = mesa;
        this.listaDePratos = listaDePratos;
    }

    //getters

    public int getId() {
        return id;
    }

    public int getMesa() {
        return mesa;
    }

    public List<Prato> getPratos() {
        return listaDePratos;
    }

    public double getValorTotalDoPedido() {
        double valor = listaDePratos.stream().mapToDouble(prato -> prato.getPreco() * prato.getQuantidade()).sum();
        this.valorTotaldoPedido = valor;
        return valorTotaldoPedido;
    }
}
