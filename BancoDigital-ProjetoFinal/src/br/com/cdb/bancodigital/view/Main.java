package br.com.cdb.bancodigital.view;

import java.util.Scanner;

import br.com.cdb.bancodigital.DAO.ClienteDAO;
import br.com.cdb.bancodigital.service.ClienteService;

public class Main {

	public static void main(String[] args) {
		
		int opcao = 0;
		
		ClienteDAO clienteDAO = new ClienteDAO();
	    ClienteService clienteService = new ClienteService(clienteDAO);
	//    CadastroCliente cadastroCliente = new CadastroCliente(clienteService);
			    
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.println("*** Banco Digital CDB ***");
		System.out.println("1 - Cadastro de cliente");
		System.out.println("2 - Consulta de cliente");
		System.out.println("3 - Listar clientes");
		System.out.println("0. Sair");
		System.out.println("Digite a opção: ");
		opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1:
			CadastroCliente.cadastrarCliente();
			break;
		case 2:
			System.out.println("Informe o CPF do cliente");
			String cpf = scanner.next();
			clienteService.consultarCliente(cpf);
	//		System.out.println("Consulta CPF: " + clienteDAO.toString());
		    break;
		case 3: 
			clienteService.listarClientes();
			
			break;
		case 0:
			System.out.println("Programa finalizado");
			break;
		default:
            System.out.println("Opção inválida.");
			}
		} while (opcao !=0);

	}
	
}

