package br.com.cdb.bancodigital.model;

import java.time.LocalDate;

public class Cliente {
	
    private String cpf;
    private String nome;
    private String dtnascto;
	private String rua;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
    private Categoria categoria;
    
	public Cliente(String cpf, String nome, String dataNascimento, String rua, String numero, String complemento, String cidade,
			String estado, String cep, Categoria categoria) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dtnascto = dataNascimento;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.categoria = categoria;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtnascto() {
		return dtnascto;
	}

	public void setDtnascto(String dtnascto) {
		this.dtnascto = dtnascto;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", data nascimento=" + dtnascto + ", rua=" + rua + ", n.="
				+ numero + ", complemento=" + complemento + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep
				+ ", categoria cliente=" + categoria + "]";
	}
	
	
}
	
    
	