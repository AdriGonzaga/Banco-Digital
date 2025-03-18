package br.com.cdb.bancodigital.service;

import java.util.List;

import br.com.cdb.bancodigital.DAO.ClienteDAO;
import br.com.cdb.bancodigital.model.Cliente;

public class ClienteService {
	
	private ClienteDAO clienteDao;
	
	public ClienteService(ClienteDAO daocli) {
		this.clienteDao = daocli;
	}
	
	public void cadastrarCliente(Cliente cliente) {
		if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
			throw new RuntimeException("Nome do cliente é obrigatório");
		}
 
   		clienteDao.cadastrarCliente(cliente);
	}
	
	public void consultarCliente(String cpf) {
		if (cpf == null ) {
			throw new RuntimeException("CPF do cliente é obrigatório");
		}
		System.out.println("consultarCliente.ClienteService");
		clienteDao.pesquisarCliente(cpf);
	}
	
    public List<Cliente> listarClientes() {
        return clienteDao.listarClientes();
    }
    
}
