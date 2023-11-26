package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		Assento assento = new Assento("16C");
		Cliente cliente = new Cliente("Fábio", assento);
		
		DAO<Object> dao = new DAO<>();
		
		//Como cliente depende de assento ele deve ser persistido por último.
		//A ordem pode ser alterada se ambos fizerem parte da mesma transação.
		dao.abrirTransacao()
		   .incluir(assento)
		   .incluir(cliente)
		   .fecharTransacao()
		   .fechar();
	}
	
}
