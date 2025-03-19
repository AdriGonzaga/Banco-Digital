package br.com.cdb.bancodigital.model;

import java.util.Date;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int idConta, double saldo, Date dataAbertura, Cliente cliente) {
    	super(idConta, saldo, dataAbertura, TipoConta.POUPANCA, cliente);
        this.taxaRendimento = 0.05;
    }

    public void calcularTaxas() {
        saldo += saldo * taxaRendimento;
    }
}