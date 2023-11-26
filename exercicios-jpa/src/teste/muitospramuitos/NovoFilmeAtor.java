package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		
		Filme filmeA = new Filme("Stardust - O Mistério da Estrela", 8.6);
		Filme filmeB = new Filme("O Homem de Aço", 7.5);
		
		Ator atorA = new Ator("Henry Cavill");
		Ator atrizB = new Ator("Michelle Pfeiffer");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<>();
		dao.incluirAtomico(filmeA);
	}
	
}
