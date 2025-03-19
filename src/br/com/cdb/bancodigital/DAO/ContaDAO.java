package br.com.cdb.bancodigital.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.cdb.bancodigital.model.Conta;
import br.com.cdb.bancodigital.model.ContaCorrente;
import br.com.cdb.bancodigital.model.ContaPoupanca;

public class ContaDAO {
    private List<Conta> contas;

    public ContaDAO() {
        this.contas = new ArrayList<>();
    }

    public void salvarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta consultarConta(int idConta) {
        for (Conta conta : contas) {
            if (conta.getIdConta() == idConta) {
                return conta;
            }
        }
        return null;
    }

    public List<Conta> listarContas() {
        return contas;
    }
}