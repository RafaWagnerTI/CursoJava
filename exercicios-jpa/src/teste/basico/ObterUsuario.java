package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuarioBusca = em.find(Usuario.class, 8L);
		System.out.println(usuarioBusca.getNome());
		
		em.close();
		emf.close();
	}
	
}
