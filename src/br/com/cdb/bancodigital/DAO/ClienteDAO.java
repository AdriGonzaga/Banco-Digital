package br.com.cdb.bancodigital.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.cdb.bancodigital.model.Cliente;

public class ClienteDAO {
    private List<Cliente> clientes;

    public ClienteDAO() {
        this.clientes = new ArrayList<>();
    }

    public void salvar(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente consultarPorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }
}