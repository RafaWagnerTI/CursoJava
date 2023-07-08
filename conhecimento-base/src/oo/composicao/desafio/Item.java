package oo.composicao.desafio;

public class Item {

	final double qtde;
	final Produto produto;
	
	Item(double qtde, Produto produto) {
		this.qtde = qtde;
		this.produto = produto;
	}
	
	double getValorItem() {
		return qtde * produto.preco;
	}
}
