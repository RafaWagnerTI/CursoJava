package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Rafael Trindade Alterado");
		
		//  Usuário é sempre alterado, mesmo sem o merge,
		//pois o campo esta sendo gerenciado.
		//  Por conta disso, o campo é atualizado de tempos
		//em tempos.
		
		//em.merge(usuario);
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
