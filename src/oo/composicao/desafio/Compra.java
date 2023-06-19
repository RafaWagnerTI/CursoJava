package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final int id;
	final List<Item> itens = new ArrayList<>();
	
	Compra(int id) {
		this.id = id;
	}
	
	void adicionarItem(double qtde, String nomeProduto, double preco) {
		this.itens.add(new Item(qtde, new Produto(nomeProduto, preco)));
	}
	
	double getValorCompra() {
		double valorTotal = 0.0;
		for (Item item : itens ) {
			valorTotal += item.getValorItem();
		}
		return valorTotal;
	}

}
