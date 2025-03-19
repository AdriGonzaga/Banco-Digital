package br.com.cdb.bancodigital.model;

import java.util.Date;

public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(int idConta, Date date, TipoConta tipo, Cliente cliente) {
        super(idConta, date, tipo, TipoConta.CORRENTE, cliente);
        this.taxaManutencao = 10.0;
    }

    public void calcularTaxas() {
        saldo -= taxaManutencao;
    }
}