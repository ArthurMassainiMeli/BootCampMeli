package br.com.meli.restaurantapi.entity;

import java.util.*;

public class Mesa {

    private int id;
    private List<Pedido> listaDePedidos;
    private double valorTotalDaMesa;

    public Mesa(int id, List<Pedido> listaDePedidos) {
        this.id = id;
        this.listaDePedidos = listaDePedidos;
    }

    // getters

    public int getId() {
        return id;
    }

    public List<Pedido> getListaDePedidos() {
        return listaDePedidos;
    }

    public double getValorTotalDaMesa() {
        double valor = listaDePedidos.stream().mapToDouble(pedido -> pedido.getValorTotalDoPedido()).sum();
        this.valorTotalDaMesa = valor;
        return valorTotalDaMesa;
    }
}
