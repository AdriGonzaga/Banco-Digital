package br.com.cdb.bancodigital.model;

import java.util.Date;

public abstract class Conta {
	
	protected static int contadorId = 1;
	protected int idConta;
	protected double saldo;
	protected Date dtabert;
	protected String tipoConta;
	protected Cliente cliente;
	
	public Conta(Cliente cliente, Date dataAbertura) {
	     this.idConta = contadorId++;
	     this.cliente = cliente;
	     this.dtabert = dataAbertura;
	     this.saldo = 0.0;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	} 
	
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public boolean transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }
	
	
	
	

}
