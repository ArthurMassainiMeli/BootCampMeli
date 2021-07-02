package br.com.meli.restaurantapi.model;

import br.com.meli.restaurantapi.entity.Mesa;
import br.com.meli.restaurantapi.entity.Pedido;
import br.com.meli.restaurantapi.entity.Prato;

import java.util.*;

public class MesaModel {

    private static List<Mesa> listaDeMesas = new ArrayList<>();

    public List<Mesa> getAllMesas() {
        return listaDeMesas;
    }

    public void insertOne(Mesa mesa) {
        listaDeMesas.add(mesa);
    }
}
