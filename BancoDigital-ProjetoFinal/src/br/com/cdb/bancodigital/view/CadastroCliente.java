package br.com.cdb.bancodigital.view;
import java.util.Scanner;

import br.com.cdb.bancodigital.DAO.ClienteDAO;
import br.com.cdb.bancodigital.model.Categoria;
import br.com.cdb.bancodigital.model.Cliente;
import br.com.cdb.bancodigital.service.ClienteService;

public class CadastroCliente {
	
    public static void cadastrarCliente() {
    	
        Scanner scanner = new Scanner(System.in);
        
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteService clienteService = new ClienteService(clienteDAO);
                
        
        System.out.println("*** Cadastro de cliente ***");
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();
        System.out.println("Digite a data de nascimento do cliente (dd/MM/yyyy):");
        String dataNascimento = scanner.nextLine();
        System.out.println("Digite o endereço do cliente:");
        String endereco = scanner.nextLine();
        System.out.println("Digite o numero do endereco:");
        String numero = scanner.nextLine(); 
        System.out.println("Digite o complemento do endereco:");
        String complemento = scanner.nextLine();
        System.out.println("Digite o CEP do cliente:");
        String cep = scanner.nextLine();
        System.out.println("Digite a cidade do cliente:");
        String cidade = scanner.nextLine();
        System.out.println("Digite o estado do cliente:");
        String estado = scanner.nextLine();
        System.out.println("Digite a categoria do cliente (COMUM, SUPER, PREMIUM):");
        String categoria = scanner.nextLine();
        Categoria categoriaEnum = Categoria.valueOf(categoria.toUpperCase());

        
        Cliente cliente = new Cliente(cpf, nome, dataNascimento, endereco, numero, complemento, cidade, estado, cep, categoriaEnum);
        
        
        clienteService.cadastrarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

}
