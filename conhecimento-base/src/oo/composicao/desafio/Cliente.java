package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void fazerPedido(Compra c) {
		this.compras.add(c);
	}
	
	double valorTotalGasto() {
		double valorGasto = 0.0;
		for(Compra c : compras) {
			valorGasto += c.getValorCompra();
		}
		return valorGasto;
	}

}
