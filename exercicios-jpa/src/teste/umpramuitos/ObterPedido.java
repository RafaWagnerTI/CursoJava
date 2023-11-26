package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {

	public static void main(String[] args) {
		DAO<Pedido> daoPedido = new DAO<>(Pedido.class);
		
		Pedido pedido = daoPedido.obterPorID(1L);
		
		for(ItemPedido item: pedido.getItens()) {
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}
		
		daoPedido.fechar();
	}
	
}
