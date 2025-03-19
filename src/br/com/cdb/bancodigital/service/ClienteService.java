package br.com.cdb.bancodigital.service;

import java.util.List;

import br.com.cdb.bancodigital.DAO.ClienteDAO;
import br.com.cdb.bancodigital.model.Cliente;

public class ClienteService {
	private ClienteDAO clienteDAO;

	public ClienteService(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	public void salvarCliente(Cliente cliente) {
		clienteDAO.salvar(cliente);
	}

	public Cliente consultarClientePorCpf(String cpf) {
		return clienteDAO.consultarPorCpf(cpf);
	}

	public List<Cliente> listarClientes() {
		return clienteDAO.listarClientes();
	}
}