package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4500/*, 0.25*/);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.95;
		
		Produto.desconto = 0.3;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double mediaCarrinho = (p1.precoComDesconto(0.25) + p2.precoComDesconto(0.45))/2;
		System.out.printf("A média do carrinho é = R$%.2f", mediaCarrinho);
		
	}
	
}
