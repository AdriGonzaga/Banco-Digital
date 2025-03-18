package br.com.cdb.bancodigital.DAO;

import br.com.cdb.bancodigital.model.Cartao;


import java.util.ArrayList;
import java.util.List;

import br.com.cdb.bancodigital.model.CartaoCredito;
import br.com.cdb.bancodigital.model.CartaoDebito;

public class CartaoDAO {
	
	private List<CartaoCredito> cartaoc;
	private List<CartaoDebito> cartaod;
	
	public CartaoDAO() {
		this.cartaoc = new ArrayList<>();
		this.cartaod = new ArrayList<>();
	}

	public void solicitarCartaoCredito(CartaoCredito cartao) {
		cartaoc.add(cartao);
	}
	
	public void solicitarCartaoDebito(CartaoDebito cartao) {
		cartaod.add(cartao);
	}
	
	public CartaoCredito consultarCartaoCredito(int numCartao) {
		for (CartaoCredito cartao : cartaoc) {
			if (cartao.getNumeroCartao() == numCartao) {
				return cartao;
			}
		}
		return null;
	}
	
	public CartaoDebito consultarCartaoDebito(int numCartao) {
		for (CartaoDebito cartao : cartaod) {
			if (cartao.getNumeroCartao() == numCartao)
				return cartao;
		}
		return null;
	}
	
	public List<CartaoCredito> listarCartaoCredito() {
		return cartaoc;
	}
	
	public List<CartaoDebito> listarCartaoDebito() {
		return cartaod;
	}
	
}
