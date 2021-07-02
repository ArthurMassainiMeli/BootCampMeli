package br.com.meli.clientesapi.repository;

import br.com.meli.clientesapi.entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    private static List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getAllClients() {
        return clientes;
    }

    public void insertOne(Cliente cliente) {
        System.out.println(cliente.toString());
        clientes.add(cliente);
    }

    public Cliente getClientById(long id) {
        return clientes.stream().filter(cliente -> cliente.getId() == id).findFirst().get();
    }


}
