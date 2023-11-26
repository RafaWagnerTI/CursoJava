package teste.desafio;

import infra.DAO;
import modelo.desafio.Comercial;
import modelo.desafio.Estabelecimento;
import modelo.desafio.Industrial;
import modelo.desafio.Proprietario;

public class NovoEstabelecimentoProprietario {
	
	public static void main(String[] args) {
		
		Proprietario p1 = new Proprietario("Melo Dias");
		Proprietario p2 = new Proprietario("Neiva Dias");
		
		Comercial c = new Comercial("Bar Bull'Dias", 100.0, "Cerveja");
		Industrial i = new Industrial("Fábrica Dias", 3000.0, "Cerveja Preta & Cerveja");
		
		c.adicionarProprietario(p1);
		c.adicionarProprietario(p2);
		i.adicionarProprietario(p2);
		
		DAO<Estabelecimento> dao = new DAO<>();
		dao.incluirAtomico(c);
		dao.incluirAtomico(i);
		
		
		
	}

}
