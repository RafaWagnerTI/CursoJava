package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tia = new Tio("Maria");
		Tio tio = new Tio("João");
		
		Sobrinho sobrinha = new Sobrinho("Helena");
		Sobrinho sobrinho = new Sobrinho("Noah");
		
		tia.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tia);
		
		tia.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tia);
		
		tio.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tio);
		
		tio.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tio);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirTransacao()
		   .incluir(tia)
		   .incluir(tio)
		   .incluir(sobrinha)
		   .incluir(sobrinho)
		   .fecharTransacao()
		   .fechar();
	}
	
}
