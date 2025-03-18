package br.com.cdb.bancodigital.model;

public class CartaoCredito extends Cartao {
	
    private double limite;
    private double saldoUtilizado;
    
    public CartaoCredito(String numeroCartao, ContaCorrente contaCorrente, double limite) {
        super(numeroCartao, contaCorrente);
        this.limite = limite;
        this.saldoUtilizado = 0;
    }
    
    public boolean realizarPagamento(double valor) {
        if (saldoUtilizado + valor > limite) {
            return false;
        }
        saldoUtilizado += valor;
        return true;
    }

}
