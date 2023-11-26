package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		em.detach(usuario); //Tira o objeto do modo gerenciado
		
		usuario.setNome("Rafael");
		
		em.merge(usuario); //Obriga o uso do merge pra atualizar
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
}
