package br.com.cdb.bancodigital.model;

import java.util.Date;

public class ContaCorrente extends Conta {
	
    private static final double TAXA_MANUTENCAO = 10.0;
    
    public ContaCorrente(Cliente cliente, Date dataAbertura) {
        super(cliente, dataAbertura);
    }
    
    public void descontarTaxa() {
        saldo -= TAXA_MANUTENCAO;
    }

}
