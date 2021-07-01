package br.com.meli.restaurantapi.controller;

import br.com.meli.restaurantapi.entity.Mesa;
import br.com.meli.restaurantapi.model.MesaModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/mesas")
public class MesaController {

    private MesaModel mesaModel = new MesaModel();

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Mesa mesa) {
        mesaModel.insertOne(mesa);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Mesa> getAll() {
        List<Mesa> allMesas = mesaModel.getAllMesas();
        return allMesas;
    }

}
