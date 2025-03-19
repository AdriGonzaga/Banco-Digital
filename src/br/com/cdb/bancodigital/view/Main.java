package br.com.cdb.bancodigital.view;

import java.util.Scanner;

import br.com.cdb.bancodigital.DAO.ClienteDAO;
import br.com.cdb.bancodigital.DAO.ContaDAO;
import br.com.cdb.bancodigital.service.ClienteService;
import br.com.cdb.bancodigital.service.ContaService;

public class Main {
    private ClienteService clienteService;
    private ContaService contaService;
    private Scanner scanner;

    public Main(ClienteService clienteService, ContaService contaService) {
        this.clienteService = clienteService;
        this.contaService = contaService;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println(" SISTEMA BANCO DIGITAL CDB ");
        System.out.println("***** Menu Principal *****");
        System.out.println("1. Gerenciar Clientes");
        System.out.println("2. Gerenciar Contas");
        System.out.println("0. Sair");
        System.out.print("Digite a opção: ");
        int opcao = Integer.parseInt(scanner.nextLine());
        switch (opcao) {
            case 1:
                MenuCliente menuCliente = new MenuCliente(clienteService);
                menuCliente.mostrarMenu();
                break;
            case 2:
                MenuConta menuConta = new MenuConta(contaService);
                menuConta.mostrarMenu();
                break;
            case 0:
                System.out.println("SISTEMA BANCO DIGITAL FINALIZADO");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteService clienteService = new ClienteService(clienteDAO);
        ContaDAO contaDAO = new ContaDAO();
        ContaService contaService = new ContaService(contaDAO);
        Main main = new Main(clienteService, contaService);
        while (true) {
            main.mostrarMenu();
        }
    }
}