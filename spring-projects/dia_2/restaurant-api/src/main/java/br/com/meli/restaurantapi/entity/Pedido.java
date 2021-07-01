package br.com.meli.restaurantapi.entity;

import java.util.*;

public class Pedido {
    private int id;
    private int mesa;
    private List<Prato> listaDePratos = new ArrayList<>();
    //private double valorTotaldoPedido;

    public Pedido(int id, int mesa, List<Prato> listaDePratos, double valorTotaldoPedido) {
        this.id = id;
        this.mesa = mesa;
        this.listaDePratos = listaDePratos;
        //this.valorTotaldoPedido = valorTotaldoPedido;
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

    //public double getValorTotal() {
     //   return valorTotaldoPedido;
   // }
}
