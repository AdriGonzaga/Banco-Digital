package br.com.cdb.bancodigital.view;
import java.util.Scanner;

import br.com.cdb.bancodigital.model.CategoriaCliente;
import br.com.cdb.bancodigital.model.Cliente;
import br.com.cdb.bancodigital.service.ClienteService;

public class CadastroCliente {
    private ClienteService clienteService;
    private Scanner scanner = new Scanner(System.in);

    public CadastroCliente(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void cadastrarCliente() {
    	System.out.print("  Digite os dados do Cliente  ");
    	System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Nome Completo: ");
        String nome = scanner.nextLine();
        System.out.print("Logradouro: ");
        String logradouro = scanner.nextLine();
        System.out.print("Número do logradouro: ");
        String numero = scanner.nextLine();
        System.out.print("Complemento do logradouro: ");
        String complemento = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("UF: ");
        String estado = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Digite a categoria do cliente (COMUM, SUPER ou PREMIUM): ");
        String categoria = scanner.nextLine();

        Cliente cliente = new Cliente(cpf, nome, logradouro, numero, complemento, cidade, estado, cep, CategoriaCliente.valueOf(categoria));
        clienteService.salvarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }
}