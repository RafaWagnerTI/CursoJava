package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Mary", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		// Mesmo solicitando a inclusão apenas do cliente,
		// o assento também é incluido por conta do parâmetro
		// cascade na anotação OneToOne do atributo assento na
		// classe Cliente.
		dao.incluirAtomico(cliente);
	}
	
}
