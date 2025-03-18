package br.com.cdb.bancodigital.service;

import java.util.List;

import br.com.cdb.bancodigital.DAO.ContaDAO;
import br.com.cdb.bancodigital.model.Conta;

public class ContaService {
	private ContaDAO contaDAO;

	public ContaService(ContaDAO contaDAO) {
		this.contaDAO = contaDAO;
	}

	public void abrirContaCorrente(Conta conta) {
	    contaDAO.abrirContaCorrente(conta);
	}

	public contaDAO consultaConta(Int idConta) {
	    return contaDAO.pesquisarContaCorrente(conta);
	}

	public List<Conta> listarContas() {
	    return contaDAO.listarTodos();
	}

	public void atualizarConta(Conta conta) {
	    contaDAO.atualizar(conta);
	}

	public void excluirConta(Long id) {
	    contaDAO.excluir(id);
	}
	
	public void abrirContaPoupanca(Conta conta) {
	    contaDAO.abrirContaPoupança(conta);
	}

}
