package br.com.meli.clientesapi.controller;

import br.com.meli.clientesapi.entity.Cliente;
import br.com.meli.clientesapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createClient(@RequestBody Cliente cliente) {
        clienteRepository.insertOne(cliente);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> getAll() {
        return clienteRepository.getAllClients();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente getByName(@PathVariable long id) {
        return clienteRepository.getClientById(id);
    }


}
