package br.com.cdb.bancodigital.view;

import java.util.List;
import java.util.Scanner;

import br.com.cdb.bancodigital.model.Cliente;
import br.com.cdb.bancodigital.service.ClienteService;

public class MenuCliente {
	
    private ClienteService clienteService;
    private Scanner scanner = new Scanner(System.in);

    public MenuCliente(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("** Menu de Clientes **");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Consultar Cliente por CPF");
            System.out.println("3. Listar todos os Clientes");
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Digite a opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    CadastroCliente cadastroCliente = new CadastroCliente(clienteService);
                    cadastroCliente.cadastrarCliente();
                    break;
	            case 2:
                    consultarClientePorCpf();
                    break;
                case 3:
                    listarClientes();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void consultarClientePorCpf() {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        Cliente cliente = clienteService.consultarClientePorCpf(cpf);
        if (cliente != null) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Logradouro: " + cliente.getLogradouro());
            System.out.println("Número: " + cliente.getNumero());
            System.out.println("Complemento: " + cliente.getComplemento());
            System.out.println("Cidade: " + cliente.getCidade());
            System.out.println("Estado: " + cliente.getEstado());
            System.out.println("CEP: " + cliente.getCep());
            System.out.println("Categoria: " + cliente.getCategoria());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void listarClientes() {
        List<Cliente> clientes = clienteService.listarClientes();
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Logradouro: " + cliente.getLogradouro());
                System.out.println("Número: " + cliente.getNumero());
                System.out.println("Complemento: " + cliente.getComplemento());
                System.out.println("Cidade: " + cliente.getCidade());
                System.out.println("Estado: " + cliente.getEstado());
                System.out.println("Categoria: " + cliente.getCategoria());
                System.out.println();
            }
        }
    }
}
