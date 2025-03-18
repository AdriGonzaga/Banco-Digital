package br.com.cdb.bancodigital.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.cdb.bancodigital.model.Conta;
import br.com.cdb.bancodigital.model.ContaCorrente;
import br.com.cdb.bancodigital.model.ContaPoupanca;

public class ContaDAO {
	
	private List<ContaCorrente> cc;
	private List<ContaPoupanca> cp;
	
	public ContaDAO(){ 
		this.cc = new ArrayList<>();
		this.cp = new ArrayList<>();
	}
	
	public void abrirContaCorrente(Conta conta) {
		cc.add(conta);
	}
	
	public void abrirContaPoupança(ContaPoupanca conta) {
		cp.add(conta);
	}
	
	public ContaCorrente pesquisarContaCorrente(int idConta) {
		for (ContaCorrente conta : cc) {
			if (conta.getIdConta() == idConta) {
				return conta;
			}
		}
		return null;
	}

	public ContaPoupanca pesquisarContaPoupanca(int idConta) {
		for (ContaPoupanca conta : cp) {
			if (conta.getIdConta() == idConta) {
				return conta;
			}
		}
		return null;
	}
	
	public List<ContaCorrente> listarContasCorrentes() {
		return cc;
	}
	
	public List<ContaPoupanca> listarContasPoupanca() {
		return cp;
	}

}
