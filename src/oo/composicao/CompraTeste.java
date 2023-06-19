package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Fulano de Tal";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem(new Item("Borracha", 12, 3.89));
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		System.out.println(compra1.itens.size());
		System.out.printf("O valor total é %.2fR$%n", compra1.obterValorTotal());
		
		//Só pra mostrar a relação bidirecional
		System.out.println(compra1.itens.get(1).compra.itens.get(2).compra.obterValorTotal());
	}
	
}
