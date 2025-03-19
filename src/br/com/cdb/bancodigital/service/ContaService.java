package br.com.cdb.bancodigital.service;

import java.util.List;

import br.com.cdb.bancodigital.DAO.ContaDAO;
import br.com.cdb.bancodigital.model.Conta;

public class ContaService {
    private ContaDAO contaDAO;

    public ContaService(ContaDAO contaDAO) {
        this.contaDAO = contaDAO;
    }

    public void salvarConta(Conta conta) {
        contaDAO.salvarConta(conta);
    }

    public Conta consultarConta(int idConta) {
        return contaDAO.consultarConta(idConta);
    }

    public List<Conta> listarContas() {
        return contaDAO.listarContas();
    }
}