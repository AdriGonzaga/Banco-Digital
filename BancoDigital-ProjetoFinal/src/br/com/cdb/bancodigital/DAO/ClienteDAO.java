package br.com.cdb.bancodigital.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.cdb.bancodigital.model.Cliente;

public class ClienteDAO {
	
    private List<Cliente> clientes;

    public ClienteDAO() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
    	System.out.println("Cliente cadastrado ");
        clientes.add(cliente);
    }

    public void excluirCliente(String cpf) {
        clientes.removeIf(cliente -> cliente.getCpf() == cpf);
    }

    public void pesquisarCliente(String cpf) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(cpf)) {
                System.out.println("*** Consulta por CPF***");
                System.out.println(clientes.get(i).getNome());;
                break;
            }
        }
    }
    /*public Cliente pesquisarCliente(String cpf) {
    	System.out.println("pesquisarCliente.ClienteDAO " + clientes.size());
        for (Cliente cliente : clientes) {
        	if (cliente.getCpf().equals(cpf)) {
        		System.out.println("*** Pesquisa por CPF ***");
            	System.out.println("Cliente: " + cliente.getNome());
            } else {
            	System.out.println("Cliente não cadastrado: ");
            }
            System.out.println("Dentro for. Cliente: " + clientes);
//        	return clientes;
        }
        System.out.println("Saida for"); 
//		return null;
		return null;
     
    }*/

    public List<Cliente> listarClientes() {
    	if (clientes.isEmpty()) {
    		System.out.println("Não há clientes cadastrados!");
    	}  else {
    		System.out.println("Lista de clientes cadastrados:");
    		for (Cliente cliente : clientes) {
    			System.out.println(cliente.toString());
    		}
    	}

    	return clientes;
    }
	
}
