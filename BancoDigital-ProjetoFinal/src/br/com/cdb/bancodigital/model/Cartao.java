package br.com.cdb.bancodigital.model;

public abstract class Cartao {
	
	protected static int contadorCartao = 500000000;
    protected boolean ativo;
    protected String senha;
    protected int numeroCartao;
    protected ContaCorrente contaCorrente;
    
    public Cartao(String numeroCartao, ContaCorrente contaCorrente) {
        this.ativo = true;
        this.numeroCartao = contadorCartao++;
        this.contaCorrente = contaCorrente;
    }
    
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
    }
    
    public void alterarStatus() {
        this.ativo = !this.ativo;
    }

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
    
    

}
