package br.com.cdb.bancodigital.model;

import java.util.Date;

public class ContaPoupanca extends Conta{
	
    private static final double TAXA_RENDIMENTO = 0.005;
    
    public ContaPoupanca(Cliente cliente, Date dataAbertura) {
        super(cliente, dataAbertura);
    }
    
    public void renderJuros() {
        saldo += saldo * TAXA_RENDIMENTO;
    }

}
