package br.com.meli.restaurantapi.entity;

import java.util.*;

public class Mesa {

    private int id;
    private List<Pedido> listaDePedidos = new ArrayList<>();
    //private double valorTotalDaMesa;

    public Mesa(int id, List<Pedido> listaDePedidos, double valorTotalDaMesa) {
        this.id = id;
        this.listaDePedidos = listaDePedidos;
        //this.valorTotalDaMesa = valorTotalDaMesa;
    }


    // getters

    public int getId() {
        return id;
    }

    public List<Pedido> getListaDePedidos() {
        return listaDePedidos;
    }

    //public double getValorTotalDaMesa() {
        //return valorTotalDaMesa;
    //}
}
