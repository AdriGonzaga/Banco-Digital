package br.com.cdb.bancodigital.model;

import java.util.Date;

public abstract class Conta {
	private static int ultimoId = 0;
    protected int idConta;
    protected double saldo;
    protected Date dataAbertura;
    protected TipoConta tipoConta;
    protected Cliente cliente;

    public Conta(int idConta, double saldo, Date dataAbertura, TipoConta tipoConta, Cliente cliente) {
        this.idConta = ++ultimoId;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.tipoConta = tipoConta;
        this.cliente = cliente;
    }

    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public abstract void calcularTaxas();

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public boolean transferir(Conta contaDestino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}

