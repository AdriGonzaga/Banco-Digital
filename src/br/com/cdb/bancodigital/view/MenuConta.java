package br.com.cdb.bancodigital.view;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.cdb.bancodigital.model.Conta;
import br.com.cdb.bancodigital.model.ContaCorrente;
import br.com.cdb.bancodigital.model.TipoConta;
import br.com.cdb.bancodigital.service.ContaService;

public class MenuConta {
	
    private ContaService contaService;
    private Scanner scanner = new Scanner(System.in);

    public MenuConta(ContaService contaService) {
        this.contaService = contaService;
    }

    public void mostrarMenu() {
        System.out.println("** Menu de Contas **");
        System.out.println("1. Cadastrar Conta");
        System.out.println("2. Consultar Conta");
        System.out.println("3. Listar Contas");
        System.out.println("4. Efetuar Transação");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("Digite a opção: ");
        int opcao = Integer.parseInt(scanner.nextLine());
        switch (opcao) {
            case 1:
                cadastrarConta();
                break;
            case 2:
                consultarConta();
                break;
            case 3:
                listarContas();
                break;
            case 0:
            	return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
    
    private void cadastrarConta() {
        System.out.print("Digite o tipo de conta (1 - Corrente, 2 - Poupança): ");
        int tipoConta = Integer.parseInt(scanner.nextLine());
        TipoConta tipo = tipoConta == 1 ? TipoConta.CORRENTE : TipoConta.POUPANCA;
        Conta conta = new ContaCorrente(0, new Date(), tipo, null);
        contaService.salvarConta(conta);
        System.out.println("Conta cadastrada com sucesso! ID da conta: " + conta.getIdConta());

    }

    private void consultarConta() {
        System.out.print("Digite o número da conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());
        Conta conta = contaService.consultarConta(numeroConta);
        if (conta != null) {
            System.out.println("Número da conta: " + conta.getIdConta());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Tipo de conta: " + conta.getTipoConta());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private void listarContas() {
    	List<Conta> contas = contaService.listarContas();
        if (!contas.isEmpty()) {
            for (Conta conta : contas) {
                System.out.println("Número da conta: " + conta.getIdConta());
                System.out.println("Saldo: " + conta.getSaldo());
                System.out.println("Tipo de conta: " + conta.getTipoConta());
                System.out.println();
            }
        } else {
            System.out.println("Nenhuma conta encontrada.");
        }
    }

    private void efetuarTransacao() {
        while (true) {
            System.out.println("** Menu de Transações **");
            System.out.println("1. Deposito");
            System.out.println("2. Saque");
            System.out.println("3. Transferência entre contas");
            System.out.println("0. Voltar ao menu anterior");
            System.out.print("Digite a opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    deposito();
                    break;
                case 2:
                    saque();
                    break;
                case 3:
                    transferenciaEntreContas();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void deposito() {
        System.out.print("Digite o número da conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = Double.parseDouble(scanner.nextLine());
        Conta conta = contaService.consultarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valorDeposito);
            contaService.salvarConta(conta);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private void saque() {
        System.out.print("Digite o número da conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o valor do saque: ");
        double valorSaque = Double.parseDouble(scanner.nextLine());
        Conta conta = contaService.consultarConta(numeroConta);
        if (conta != null) {
            if (conta.sacar(valorSaque)) {
                contaService.salvarConta(conta);
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private void transferenciaEntreContas() {
        System.out.print("Digite o número da conta de origem: ");
        int numeroContaOrigem = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o número da conta de destino: ");
        int numeroContaDestino = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o valor da transferência: ");
        double valorTransferencia = Double.parseDouble(scanner.nextLine());
        Conta contaOrigem = contaService.consultarConta(numeroContaOrigem);
        Conta contaDestino = contaService.consultarConta(numeroContaDestino);
        if (contaOrigem != null && contaDestino != null) {
            if (contaOrigem.transferir(contaDestino, valorTransferencia)) {
                contaService.salvarConta(contaOrigem);
                contaService.salvarConta(contaDestino);
                System.out.println("Transferência realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
    }
}
