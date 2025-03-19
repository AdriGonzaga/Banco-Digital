package br.com.cdb.bancodigital.model;

//Cliente.java
public class Cliente {
 private String cpf;
 private String nome;
 private String logradouro;
 private String numero;
 private String complemento;
 private String cidade;
 private String estado;
 private String cep;
 private CategoriaCliente categoria;

 public Cliente(String cpf, String nome, String logradouro, String numero, String complemento, String cidade, String estado, String cep, CategoriaCliente categoria) {
     this.cpf = cpf;
     this.nome = nome;
     this.logradouro = logradouro;
     this.numero = numero;
     this.complemento = complemento;
     this.cidade = cidade;
     this.estado = estado;
     this.cep = cep;
     this.categoria = categoria;
 }

 // Getters e Setters
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

 public String getLogradouro() {
     return logradouro;
 }

 public void setLogradouro(String logradouro) {
     this.logradouro = logradouro;
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

public CategoriaCliente getCategoria() {
     return categoria;
 }

 public void setCategoria(CategoriaCliente categoria) {
     this.categoria = categoria;
 }

@Override
public String toString() {
	return "Cliente [cpf=" + cpf + ", nome=" + nome + ", logradouro=" + logradouro + ", numero=" + numero
			+ ", complemento=" + complemento + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep
			+ ", categoria=" + categoria + "]";
}
 
 
 
}
