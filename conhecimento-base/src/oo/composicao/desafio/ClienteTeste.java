package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente c = new Cliente("Cleison");
		
		Compra c1 = new Compra(1);
		c1.adicionarItem(520, "Bloco de Concreto Celular", 12.79);
		c1.adicionarItem(1246, "Cobogó Bruto", 3.89);
		
		Compra c2 = new Compra(2);
		c2.adicionarItem(1500, "Lajota Refratária", 69.90);
		c2.adicionarItem(320, "Bloco de Vidro Ondulado Incolor", 16.79);
		
		c.fazerPedido(c1);
		c.fazerPedido(c2);
		
		System.out.printf("O cliente %s gastou %.2fR$ na loja.", c.nome, c.valorTotalGasto());
	}
	
}
