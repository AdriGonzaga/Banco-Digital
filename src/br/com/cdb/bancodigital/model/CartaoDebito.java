package br.com.cdb.bancodigital.model;

public class CartaoDebito extends Cartao {
	
    private double limiteDiario;
    private double gastoDiario;
    
    public CartaoDebito(String numeroCartao, ContaCorrente contaCorrente, double limiteDiario) {
        super(numeroCartao, contaCorrente);
        this.limiteDiario = limiteDiario;
        this.gastoDiario = 0;
    }
    
    public boolean realizarPagamento(double valor) {
        if (gastoDiario + valor > limiteDiario) {
            return false;
        }
        gastoDiario += valor;
        return true;
    }
    
    public void alterarLimiteDiario(double novoLimite) {
        this.limiteDiario = novoLimite;
    }

}
